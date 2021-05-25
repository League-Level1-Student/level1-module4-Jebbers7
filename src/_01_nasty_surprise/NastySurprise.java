package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trickButton = new JButton();
	JButton treatButton = new JButton();
	void setup() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	
	frame.add(panel);
	panel.add(trickButton);
	panel.add(treatButton);
	trickButton.setText("Trick");
	treatButton.setText("Treat");
	trickButton.addActionListener(this);
	treatButton.addActionListener(this);
	frame.pack();
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	if(event.getSource() == trickButton) {
		showPictureFromTheInternet("https://images2.minutemediacdn.com/image/upload/c_crop,h_1192,w_2119,x_0,y_178/f_auto,q_auto,w_1100/v1619704248/shape/mentalfloss/646037-gettyimages-1077145200.jpg");
	}
	else if(event.getSource() == treatButton) {
		showPictureFromTheInternet("https://cdn.mos.cms.futurecdn.net/er4CESqYpgPi4zcSbW8iaT-1200-80.jpg");
	}
}
}