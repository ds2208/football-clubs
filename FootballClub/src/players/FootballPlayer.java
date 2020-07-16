package players;

public class FootballPlayer extends Person {

	private double weeklySalary;
	private int numberDoneSeasons;
	private String sponsor;
	private boolean substitution;
	private double annualEarnings;
	private int goals;
	private int assists;
	private String position;

	public FootballPlayer(String ime, String prezime, String jmbg, String adresa, double weeklySalary,
			int numberDoneSeasons, String sponsor, boolean substitution, int goals, int assists) {
		super(ime, prezime, jmbg, adresa);
		this.weeklySalary = weeklySalary;
		if (numberDoneSeasons > 0) {
			this.numberDoneSeasons = numberDoneSeasons;
		} else {
			this.numberDoneSeasons = 1;
		}
		this.sponsor = sponsor;
		this.substitution = substitution;
		this.annualEarnings = weeklySalary * 52;
		this.goals = goals;
		this.assists = assists;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public int getNumberDoneSeasons() {
		return numberDoneSeasons;
	}

	public void setNumberDoneSeasons(int numberDoneSeasons) {
		this.numberDoneSeasons = numberDoneSeasons;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public boolean isSubstitution() {
		return substitution;
	}

	public void setSubstitution(boolean substitution) {
		this.substitution = substitution;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getAnnualEarnings() {
		return annualEarnings;
	}

	public void setAnnualEarnings(double annualEarnings) {
		this.annualEarnings = annualEarnings;
	}
	
	@Override
	public String toString() {
		return "FootballPlayer [weeklySalary=" + weeklySalary + ", numberDoneSeasons=" + numberDoneSeasons
				+ ", sponsor=" + sponsor + ", substitution=" + substitution + ", annualEarnings=" + annualEarnings
				+ ", goals=" + goals + ", assists=" + assists + "]";
	}

}
