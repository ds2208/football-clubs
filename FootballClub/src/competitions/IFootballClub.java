package competitions;

import players.FootballPlayer;

public interface IFootballClub {
	
	public FootballPlayer theMostExpensive();
	public FootballPlayer unefective();
	public int playerPerPosition(String position);
	public FootballPlayer theCheapestSub();
	
}
