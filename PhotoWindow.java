package termproject;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class PhotoWindow extends JFrame{
	
	private JFrame photoFrame = new JFrame();
	private ImageIcon image = new ImageIcon("/Users/jameshennessy67/calculator1/images/Liverpool.jpg");
	private JLabel label = new JLabel();
	private MainWindow parent;
//	private JButton button = new JButton("Football", image);
	public PhotoWindow() {
		photoFrame.setLocationRelativeTo(parent);
		photoFrame.setTitle("Liverpool 2019/20");
		photoFrame.setSize(500, 500);
		photoFrame.setLayout(new MigLayout());
		photoFrame.setVisible(true);
		photoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		photoFrame.add(label);
		
		
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(150,150,150));
		label.setIconTextGap(-25);
		label.setBackground(Color.black);
	
	}
}
