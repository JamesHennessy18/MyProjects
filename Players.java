package termproject;

public class Players {
		private String name;
		private int games;
		private int goals;
		private int assists;
		private int tackles;
		private int cleanSheet;
	
		public Players(String name, int games, int goals, int assists, int tackles, int cleanSheet)
		{
			super();
			this.name = name;
			this.games = games;
			this.goals = goals;
			this.assists = assists;
			this.tackles = tackles;
			this.cleanSheet = cleanSheet;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public int getGames()
		{
			return games;
		}
		
		public void setGames(int games)
		{
			this.games = games;
		}
		
		public int getGoals()
		{
			return goals;
		}
		
		public void setGoals(int goals)
		{
			this.goals = goals;
		}
		
		public int getAssists()
		{
			return assists;
		}
		
		public void setAssists(int assists)
		{
			this.assists = assists;
		}
		
		public int getTackles()
		{
			return tackles;
		}
		
		public void setTackles(int tackles)
		{
			this.tackles = tackles;
		}
		
		public int getCleanSheet()
		{
			return cleanSheet;
		}
		
		public void set(int cleanSheet)
		{
			this.cleanSheet = cleanSheet;
		}
		
		
		
		

}
