package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField leftTextField = new JTextField(20);
	JButton button = new JButton();
	JLabel label = new JLabel();
	PigLatinTranslator translator = new PigLatinTranslator();
	
void run() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(leftTextField);
	panel.add(button);
	panel.add(label);
	button.setText("translate");
	button.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String output = translator.translate(leftTextField.getText());
	label.setText(output);
	frame.pack();
	}
}

