package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
int num1;
int num2;
JFrame frame = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
JButton addButton = new JButton();
JButton subButton = new JButton();
JButton mulButton = new JButton();
JButton divButton = new JButton();
JTextField textField = new JTextField(10);
JTextField textField2 = new JTextField(10);
void run() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(textField);
	panel.add(textField2);
	panel.add(addButton);
	panel.add(subButton);
	panel.add(mulButton);
	panel.add(divButton);
	panel.add(label);

	addButton.setText("add");
	subButton.setText("sub");
	mulButton.setText("mul");
	divButton.setText("div");
	
	addButton.addActionListener(this);
	subButton.addActionListener(this);
	mulButton.addActionListener(this);
	divButton.addActionListener(this);
	frame.pack();
}
int add() {	
	return num1 + num2;
}
int subtract() {
	return num1 - num2;
}
int multiply() {
	return num1 * num2;
}
double divide() {
	return num1 / num2;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	num1 = Integer.parseInt(textField.getText());
	num2 = Integer.parseInt(textField2.getText());
	int answer1 = 0;
	double answer2 = 0;
	if (e.getSource() == addButton) {
		answer1 = add();
	}
	else if (e.getSource() == subButton) {
		answer1 = subtract();
	}
	else if (e.getSource() == mulButton) {
		answer1 = multiply();
	}
	else if(e.getSource() == divButton) {
		answer2 = divide();
		label.setText(String.valueOf(answer2));
		return;
	}
label.setText(String.valueOf(answer1));
frame.pack();
}}
