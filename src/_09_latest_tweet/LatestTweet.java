package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(10);
	JButton button = new JButton();
	
void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(textField);
	panel.add(button);
	button.setText("Search");
	button.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Tweet, Tweet");
}
}
