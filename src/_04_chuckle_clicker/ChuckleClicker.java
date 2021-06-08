package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	
void makeButtons() {
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.setText("Joke");
	button2.setText("Punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Hi");
	if(event.getSource() == button) {
		JOptionPane.showMessageDialog(null, "What do you call a fake noodle?");
	}
	if(event.getSource() == button2) {
		JOptionPane.showMessageDialog(null, "An impasta!");
	}
}
}
