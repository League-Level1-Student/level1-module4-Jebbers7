package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addButton = new JButton();
JButton subButton = new JButton();
JButton mulButton = new JButton();
JButton divButton = new JButton();
JTextField textField = new JTextField();
JTextField textField2 = new JTextField();
void run() {
	frame.add(panel);
	panel.add(addButton);
	panel.add(subButton);
	panel.add(mulButton);
	panel.add(divButton);
	panel.add(textField);
	panel.add(textField2);

	addButton.setText("add");
	subButton.setText("sub");
	mulButton.setText("mul");
	divButton.setText("div");
	
	addButton.addActionListener(this);
	subButton.addActionListener(this);
	mulButton.addActionListener(this);
	divButton.addActionListener(this);
}
void add() {	
	
}
void subtract() {
	
}
void multiply() {
	
}
void divide() {
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == addButton) {
		
	}


}
