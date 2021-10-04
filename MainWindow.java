package termproject;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

public class MainWindow extends JFrame {
	
		private JMenuBar menuBar = new JMenuBar();
		private JMenu fileMenu = new JMenu("File");
		private JMenu goMenu = new JMenu("Go To");
		private JMenu addMenu = new JMenu("Add Player");
		private JMenuItem staffMenuItem = new JMenuItem("Staff...");
		private JMenuItem fixturesMenuItem = new JMenuItem("Fixtures...");
		private JMenuItem addMenuItem = new JMenuItem("Add To Roster...");
		private JMenuItem saveMenuItem = new JMenuItem("Save");
		private JMenuItem exitMenuItem = new JMenuItem("exit");
		private JMenuItem teamPhotoMenuItem = new JMenuItem("Team Photo");
		private List<Players> player = new ArrayList<>();
		private PlayersTableModel pTableModel = new PlayersTableModel(player);
		private JTable playerTable = new JTable(pTableModel);
		private JScrollPane playerSP = new JScrollPane(playerTable);
		private JFileChooser fc = new JFileChooser();
		
	public MainWindow(String title) {
		super(title);
		this.setLayout(new MigLayout());
		player.add(new Players("Salah", 11, 9, 3, 3, 0));
		player.add(new Players("Firmino", 11, 1, 4, 2, 0));
		player.add(new Players("Jota", 11, 6, 1, 1, 0));
		player.add(new Players("Van Dijk", 11, 1, 1, 14, 0));
		player.add(new Players("Alexander-Arnold", 11, 2, 7, 9, 0));
		player.add(new Players("Robertson", 11, 0, 8, 9, 4));
		player.add(new Players("Henderson", 11, 0, 2, 11, 0));
		player.add(new Players("Matip", 11, 0, 0, 18, 0));
		player.add(new Players("Fabinho", 11, 0, 0, 12, 0));
		player.add(new Players("Minamino", 11, 2, 4, 3, 0));
		player.add(new Players("Origi", 11, 3, 1, 2, 0));
		player.add(new Players("WIjnaldum", 11, 5, 3, 8, 0));
		player.add(new Players("Allison", 11, 4, 6, 5, 4));
		player.add(new Players("Gomez", 11, 0, 0, 13, 0));
		player.add(new Players("Milner", 11, 0, 1, 10, 0));
		player.add(new Players("Chamberlain", 11, 2, 2, 3, 0));
		player.add(new Players("Thiago", 11, 1, 7, 5, 0));
		player.add(new Players("Kelleher", 11, 0, 0, 0, 3));
		player.add(new Players("Jones", 11, 0, 1, 8, 0));
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(goMenu);
		menuBar.add(addMenu);
		fileMenu.add(saveMenuItem);
		fileMenu.add(exitMenuItem);
		goMenu.add(staffMenuItem);
		goMenu.add(fixturesMenuItem);
		goMenu.add(teamPhotoMenuItem);
		addMenu.add(addMenuItem);
		
		addMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PlayerDialog dialog = new PlayerDialog(MainWindow.this, "Add Player", true);
				dialog.setVisible(true);
			}
			
			
		});
		this.add(playerSP);
		playerTable.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
			JTable table = (JTable)e.getSource();
			if (e.getClickCount() == 2) {
				int index = table.getSelectedRow();
				Players players = player.get(index);
				PlayerDialog dialog = new PlayerDialog(MainWindow.this, "Edit Player stats", true, players, index);
				dialog.setVisible(true);	
				
			}
			}
			
			
		});
				
		teamPhotoMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				PhotoWindow photoFrame = new PhotoWindow();
			
			}	
		});
		
	
	
	staffMenuItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			StaffWindow staffFrame = new StaffWindow();
		
		}	
	});
	
	fixturesMenuItem.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			FixturesWindow fixturesFrame = new FixturesWindow();
		
		}	
	});
		
	saveMenuItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			int returnVal = fc.showOpenDialog(MainWindow.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file =fc.getSelectedFile();
		
		}
		}
	});
	
	}
	
		
		public void addPlayer(Players players) { 
			player.add(players);
			pTableModel.fireTableDataChanged();
			
		}
		
		
		public void editPlayer(Players players, int index) {
			player.set(index, players);
			pTableModel.fireTableRowsUpdated(index, index);
			
		}
	
	
	public static void main(String[] args) {
		String systemLookAndFeelClassName = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(systemLookAndFeelClassName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		MainWindow window = new MainWindow("LFC DataBase");
		window.setSize(700, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

}



