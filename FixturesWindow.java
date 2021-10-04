package termproject;

import javax.swing.JFrame;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class FixturesWindow extends JFrame{
	
	private JFrame fixturesFrame = new JFrame();
	private JLabel match1 = new JLabel("19/12/20 --> Crystal Palace vs Liverpool");
	private JLabel match2 = new JLabel("27/12/20 --> Liverpool vs West Brom");
	private JLabel match3 = new JLabel("30/12/20 --> Newcastle vs Liverpool");
	private JLabel match4 = new JLabel("30/12/20 --> Southhampton vs Liverpool");
	private JLabel match5 = new JLabel("30/12/20 --> Aston Villa vs Liverpool");
	private JLabel match6 = new JLabel("30/12/20 --> Liverpool vs Man United");
	private JLabel match7 = new JLabel("30/12/20 --> Liverpool vs Burnley");
	private JLabel match8 = new JLabel("30/12/20 --> Tottenham vs Liverpool");
	private JLabel match9 = new JLabel("30/12/20 --> West Ham vs Liverpool");
	private JLabel match10 = new JLabel("30/12/20 --> Brighton vs Liverpool");
	private MainWindow parent;
	
	public FixturesWindow() {
		fixturesFrame.setLocationRelativeTo(parent);
		fixturesFrame.setSize(300, 300);
		fixturesFrame.setLayout(new MigLayout());
		fixturesFrame.setVisible(true);
		fixturesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		fixturesFrame.add(match1, "wrap");
		fixturesFrame.add(match2, "wrap");
		fixturesFrame.add(match3, "wrap");
		fixturesFrame.add(match4, "wrap");
		fixturesFrame.add(match5, "wrap");
		fixturesFrame.add(match6, "wrap");
		fixturesFrame.add(match7, "wrap");
		fixturesFrame.add(match8, "wrap");
		fixturesFrame.add(match9, "wrap");
		fixturesFrame.add(match10, "wrap");
	
	}
}
