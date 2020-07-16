package competitions;

import java.util.ArrayList;

import players.FootballPlayer;

public class League implements ILeague {

	private String leagueName;
	private String sponsor;
	private ArrayList<FootballClub> clubs;
	private int numOfClubs;
	private int numOfPlayers;
	private int numOfCoachs;

	public League(String leagueName, String sponsor, ArrayList<FootballClub> clubs) {
		super();
		this.leagueName = leagueName;
		this.sponsor = sponsor;
		this.clubs = clubs;
		this.numOfClubs = this.clubs.size();
		this.numOfPlayers = numOfPlayers();
		this.numOfCoachs = this.clubs.size();
	}

	private int numOfPlayers() {
		int numOfPlayers = 0;
		for (FootballClub footballClub : clubs) {
			numOfPlayers += footballClub.getPlayers().size();
		}
		return numOfPlayers;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public ArrayList<FootballClub> getClubs() {
		return clubs;
	}

	public void setClubs(ArrayList<FootballClub> clubs) {
		this.clubs = clubs;
	}

	public int getNumOfClubs() {
		return numOfClubs;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public int getNumOfCoachs() {
		return numOfCoachs;
	}

	@Override
	public FootballClub mostEmployees() {
		FootballClub meClub = null;
		if (!clubs.isEmpty()) {
			meClub = clubs.get(0);
			for (FootballClub footballClub : clubs) {
				if (footballClub.getNumberOfEmployee() > meClub.getNumberOfEmployee()) {
					meClub = footballClub;
				}
			}
		}
		return meClub;
	}

	@Override
	public double avgExpenceClub() {
		double avgExpenceClub = 0;
		for (FootballClub footballClub : clubs) {
			avgExpenceClub += footballClub.getYearExpense();
		}
		if (!clubs.isEmpty()) {
			avgExpenceClub /= clubs.size();
		}
		return avgExpenceClub;
	}

	@Override
	public FootballPlayer theMostExpensivePlayerOfLeague() {
		FootballPlayer tmePlayerofLeague = null;
		if (!clubs.isEmpty()) {
			if (!clubs.get(0).getPlayers().isEmpty()) {
				tmePlayerofLeague = clubs.get(0).getPlayers().get(0);
			}
		}
		for (FootballClub footballClub : clubs) {
			if (!footballClub.getPlayers().isEmpty()) {
				for (FootballPlayer footballPlayer : footballClub.getPlayers()) {
					if (tmePlayerofLeague.getAnnualEarnings() > footballPlayer.getAnnualEarnings()) {
						tmePlayerofLeague = footballPlayer;
					}
				}
			}
		}
		return tmePlayerofLeague;
	}

	@Override
	public int numPlayersSponsorLeague() {
		int numPlayersSponsorLeague = 0;
		for (FootballClub footballClub : clubs) {
			for (FootballPlayer footballPlayer : footballClub.getPlayers()) {
				if (footballPlayer.getSponsor().equals(this.sponsor)) {
					numPlayersSponsorLeague++;
				}
			}
		}
		return numPlayersSponsorLeague;
	}
}
