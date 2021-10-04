package termproject;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PlayersTableModel extends AbstractTableModel {
	
	private List<Players> player;
	private String[] columnNames = {"Name", "GP", "Goals", "Assists", "Tackles", "Clean Sheets"};
	
	public PlayersTableModel(List<Players> player)
	{
		this.player = player;
	}

	@Override
	public int getColumnCount() {

		return columnNames.length;
	}

	@Override
	public int getRowCount() {
	
		return player.size();
	}
	
	@Override
	public String getColumnName(int column)
	{
		return columnNames[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Players players = player.get(rowIndex);
		String result = null;
		switch (columnIndex)
		{
		case 0:
			result = players.getName();
			break;
		case 1:
			result = Integer.toString(players.getGames());
			break;
		case 2:
			result = Integer.toString(players.getGoals());
			break;
		case 3:
			result = Integer.toString(players.getAssists());
			break;
		case 4:
			result = Integer.toString(players.getTackles());
			break;
		case 5:
			result = Integer.toString(players.getCleanSheet());
			break;
		}
		return result;
	}

}
