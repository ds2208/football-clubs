package competitions;

import java.util.ArrayList;

import players.Coach;
import players.FootballPlayer;

public class FootballClub implements IFootballClub {

	private String clubName;
	private Coach coach;
	private ArrayList<FootballPlayer> players;
	private int numberOfEmployee;
	private int clubTrophies;
	private double yearExpense;

	public FootballClub(String clubName, Coach coach, ArrayList<FootballPlayer> players, int clubTrophies,
			double yearExpense) {
		super();
		this.clubName = clubName;
		this.coach = coach;
		this.players = players;
		this.numberOfEmployee = numberOfEmployee(this.coach, this.players);
		this.clubTrophies = clubTrophies;
		this.yearExpense = yearExpense();
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public ArrayList<FootballPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<FootballPlayer> players) {
		this.players = players;
	}

	public int getClubTrophies() {
		return clubTrophies;
	}

	public void setClubTrophies(int clubTrophies) {
		this.clubTrophies = clubTrophies;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public double getYearExpense() {
		return yearExpense;
	}

	private int numberOfEmployee(Coach coach, ArrayList<FootballPlayer> players) {
		int size = players.size();
		if (coach != null)
			return size + 1;
		else
			return size;
	}

	private double yearExpense() {
		double s = 0;
		for (FootballPlayer footballPlayer : players) {
			s = s + footballPlayer.getAnnualEarnings();
		}
		return s + coach.getAnnualEarnings();
	}

	@Override
	public FootballPlayer theMostExpensive() {
		FootballPlayer tmePlayer = null;
		if (!players.isEmpty()) {
			tmePlayer = players.get(0);
			for (FootballPlayer footballPlayer : players) {
				if (footballPlayer.getAnnualEarnings() > tmePlayer.getAnnualEarnings()) {
					tmePlayer = footballPlayer;
				}
			}
		}
		return tmePlayer;
	}

	@Override
	public FootballPlayer unefective() {
		FootballPlayer unefectPlayer = null;
		if (!players.isEmpty()) {
			unefectPlayer = players.get(0);
			for (FootballPlayer footballPlayer : players) {
				if ((footballPlayer.getGoals() + footballPlayer.getAssists()) < (unefectPlayer.getAssists()
						+ unefectPlayer.getGoals())) {
					unefectPlayer = footballPlayer;
				}
			}
		}
		return unefectPlayer;
	}

	@Override
	public int playerPerPosition(String position) {
		int s = 0;
		for (FootballPlayer footballPlayer : players) {
			if(footballPlayer.getPosition().equals(position)) {
				s++;
			}
		}
		return s;
	}

	@Override
	public FootballPlayer theCheapestSub() {
		FootballPlayer cheapSub = null;
		cheapSub = players.get(0);
		for (FootballPlayer footballPlayer : players) {
			if(footballPlayer.isSubstitution()) {
				if(cheapSub.getWeeklySalary() > footballPlayer.getWeeklySalary()) {
					cheapSub = footballPlayer;
				}
			}
		}
		return cheapSub;
	}

}
