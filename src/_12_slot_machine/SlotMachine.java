package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton();
	JLabel cherryLabel = new JLabel();
	JLabel orangeLabel = new JLabel();
	JLabel limeLabel = new JLabel();
	Random ran = new Random();
	void run() {
		frame.setSize(500,500);
		frame.add(panel);
		panel.add(spinButton);
		spinButton.setText("SPIN!");
		spinButton.addActionListener(this);
		try {
			cherryLabel = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			orangeLabel = createLabelImage("orange.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			limeLabel = createLabelImage("lime.jpeg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int leftReelNumber = ran.nextInt(3);
		if(leftReelNumber == 0) {
			try {
				cherryLabel = createLabelImage("cherry.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(leftReelNumber == 1) {
			panel.add(orangeLabel);
		}
		else {
			panel.add(limeLabel);
		}
		int rightReelNumber = ran.nextInt(3);
		if(rightReelNumber == 0) {
			panel.add(cherryLabel);
		}
		else if(rightReelNumber == 1) {
			panel.add(orangeLabel);
		}
		else {
			panel.add(limeLabel);
		}
	}

}
