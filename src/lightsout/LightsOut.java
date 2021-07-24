package lightsout;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * @author keithgroves
 */
public class LightsOut implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public LightsOut() {

		// PART 1. CREATE YOUR LIGHT BOARD
		// ----a. create a basic UI and add 25 JLabels (these are your lights)
		frame.setVisible(true);
		frame.add(panel);
		for(int i = 0; i < 25; i++) {
		JLabel light = new JLabel();
		panel.add(light);
		light.setText("" + i);
		light.setBackground(Color.LIGHT_GRAY);
		light.setOpaque(true);
		light.addMouseListener(this);
		}
		frame.setSize(500,500);
		// ----------change the layout of your panel to a 5x5 grid: panel.setLayout(new GridLayout(5, 5));
		panel.setLayout(new GridLayout(5, 5));
		// ----b. use setText() to number each light (0-24).
		
		// ----c. set the background of each label to LIGHT_GRAY
		
		// ---------you will also have to set the background to opaque. Use: light.setOpaque(true);
		
		// ----d. add a mouseListener to each light

	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// PART 1: TOGGLE NEIGHBORING LIGHTS
		// ----a. get the light that was clicked on `(JLabel) e.getSource`
		JLabel light = (JLabel)e.getSource();
		// ----b. get the number of the light
		String lightText = light.getText();
		// ----c. Now use the move method to code which lights turn on and off.
		int position = Integer.parseInt(lightText);
		move(panel, position);
		// ----e. check if the player has won (eg. all the lights are off)
		for(int i = 0; i < 25; i++) {
			JLabel onOff = (JLabel) panel.getComponent(i);
			if(onOff.getBackground() == Color.WHITE) {
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "You win!");
		
		//PART 3: Go back and randomize the board to make it challenging.
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);
			
		} else {
			label.setBackground(Color.WHITE);
		}
	}
	
	
	void move(JPanel lightPanel, int pos) {
		toggle((JLabel) lightPanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) lightPanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) lightPanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) lightPanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) lightPanel.getComponent(pos + 5));
		}
	}



	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
}
