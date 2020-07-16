package competitions;

import players.FootballPlayer;

public interface ILeague {
	
	public FootballClub mostEmployees();
	public double avgExpenceClub();
	public FootballPlayer theMostExpensivePlayerOfLeague();
	public int numPlayersSponsorLeague();
	
}
