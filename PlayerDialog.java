package termproject;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PlayerDialog extends JDialog {

	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameTextField = new JTextField(20);
	private JLabel gamesLabel = new JLabel("Games");
	private JTextField gamesTextField = new JTextField(20);
	private JLabel goalsLabel = new JLabel("Goals");
	private JTextField goalsTextField = new JTextField(20);
	private JLabel assistsLabel = new JLabel("Assists");
	private JTextField assistsTextField = new JTextField(20);
	private JLabel tacklesLabel = new JLabel("Tackles");
	private JTextField tacklesTextField = new JTextField(20);
	private JLabel cleanSheetLabel = new JLabel("Clean Sheets");
	private JTextField cleanSheetTextField = new JTextField(20);
	private JButton saveButton = new JButton("Save");
	private JButton cancelButton = new JButton("Cancel");
	private JLabel goalErrorLabel = new JLabel("Error, Invalid number");
	private MainWindow parent;
	private Players players;
	private int index;
	
	public PlayerDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.setLayout(new MigLayout());
		parent = (MainWindow)this.getParent();
		this.setLocationRelativeTo(parent);
		this.add(nameLabel);
		this.add(nameTextField, "wrap");
		this.add(gamesLabel);
		this.add(gamesTextField, "wrap");
		this.add(goalsLabel);
		this.add(goalsTextField, "wrap");
		this.add(assistsLabel);
		this.add(assistsTextField, "wrap");
		this.add(tacklesLabel);
		this.add(tacklesTextField, "wrap");
		this.add(cleanSheetLabel);
		this.add(cleanSheetTextField, "wrap");
		this.add(goalErrorLabel, "Skip 1, wrap");
		goalErrorLabel.setForeground(Color.RED);
		goalErrorLabel.setVisible(false);
		this.add(saveButton, "tag Save, Skip 1, split 2");
		this.add(cancelButton, "tag Cancel");
		this.pack();
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PlayerDialog.this.setVisible(false);
			}
			
			});
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean allOk = true;
				String name = nameTextField.getText();
				
				String gamesAsString = gamesTextField.getText();
				int games = Integer.parseInt(gamesAsString);
				
				String goalsAsString = goalsTextField.getText();
				int goals = 0;
				try {
					goals = Integer.parseInt(goalsAsString);
				}
				catch (NumberFormatException e1) {
					allOk = false;
					goalErrorLabel.setVisible(true);
				}
				
				if(allOk) {
					String assistsAsString = assistsTextField.getText();
					int assists = Integer.parseInt(assistsAsString);
					
					String tacklesAsString = tacklesTextField.getText();
					int tackles = Integer.parseInt(tacklesAsString);
					
					String cleanSheetAsString = cleanSheetTextField.getText();
					int cleanSheet = Integer.parseInt(cleanSheetAsString);
					
					Players newPlayer = new Players(name, games, goals, assists, tackles, cleanSheet);
					parent.addPlayer(newPlayer);
					if (players == null) {
						parent.addPlayer(newPlayer);
					}
					else {
						parent.editPlayer(newPlayer, index);
					}
					PlayerDialog.this.setVisible(false);
				}
				}
				
			
			
		});
	}
	public PlayerDialog(Frame owner, String title, boolean modal, Players players, int index) 
	{
		this(owner, title, modal);
		this.players = players;
		this.index = index;
		nameTextField.setText(players.getName());
		gamesTextField.setText(Integer.toString(players.getGames()));
		goalsTextField.setText(Integer.toString(players.getGoals()));
		assistsTextField.setText(Integer.toString(players.getAssists()));
		tacklesTextField.setText(Integer.toString(players.getTackles()));
		cleanSheetTextField.setText(Integer.toString(players.getCleanSheet()));
		
	}
}
