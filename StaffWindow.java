package termproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class StaffWindow extends JFrame{
	private JFrame staffFrame = new JFrame();
    private MainWindow parent;
    private ImageIcon image1 = new ImageIcon("/Users/jameshennessy67/calculator1/images/jurgenKlopp.jpg");
    private ImageIcon image2 = new ImageIcon("/Users/jameshennessy67/calculator1/images/pep.jpg");
    private ImageIcon image3 = new ImageIcon("/Users/jameshennessy67/calculator1/images/BarryHunter.jpg");
    private JLabel label1 = new JLabel("Manager: Jurgen Klopp");
    private JLabel label2 = new JLabel("Assistant: Pep Lijnders.");
    private JLabel label3 = new JLabel("Chief Scout: Barry Hunter");
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    	public StaffWindow() {
			parent = (MainWindow)this.getParent();	
			staffFrame.setLocationRelativeTo(parent);
			staffFrame.setSize(700, 700);
			staffFrame.setLayout(new MigLayout());
			staffFrame.setVisible(true);
			staffFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			staffFrame.add(label1);
			staffFrame.add(label4, "wrap");
			staffFrame.add(label2);
			staffFrame.add(label5, "wrap");
			staffFrame.add(label3);
			staffFrame.add(label6, "wrap");
			
			label4.setIcon(image1);
			label4.setHorizontalTextPosition(JLabel.CENTER);
			label4.setVerticalTextPosition(JLabel.TOP);
			label4.setForeground(new Color(150,150,150));
			label4.setIconTextGap(-25);
			label4.setBackground(Color.black);
			
			label5.setIcon(image2);
			label5.setHorizontalTextPosition(JLabel.CENTER);
			label5.setVerticalTextPosition(JLabel.TOP);
			label5.setForeground(new Color(150,150,150));
			label5.setIconTextGap(-25);
			label5.setBackground(Color.black);
			
			label6.setIcon(image3);
			label6.setHorizontalTextPosition(JLabel.CENTER);
			label6.setVerticalTextPosition(JLabel.TOP);
			label6.setForeground(new Color(150,150,150));
			label6.setIconTextGap(-25);
			label6.setBackground(Color.black);
			
		}
}



		
