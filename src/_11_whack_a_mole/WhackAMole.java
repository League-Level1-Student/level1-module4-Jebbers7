package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Random ran = new Random();
JButton moleButton;
int count = 0;
int missedCount = 0;
void run() {
	drawButtons();
}
void drawButtons() {
	frame = new JFrame();
	panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(150,200);
	int random = ran.nextInt(24);
	for(int i = 0; i < 24; i++) {
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
		if(random == i) {
			moleButton = button;
			button.setText("mole!");
		}
	}
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(moleButton != arg0.getSource()) {
		speak("You missed!");
		missedCount++;
		if(missedCount == 5) {
			JOptionPane.showMessageDialog(null, "You lost the game");
			endGame(null, count);
		}
	}
	else {
		speak("You whacked a mole!");
		count++;
		if(count == 10) {
			endGame(null, count);
		}
	}
}
}
