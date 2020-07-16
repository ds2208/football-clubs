package players;

public class Coach extends Person {

	private double annualEarnings;
	private String sponsor;
	private boolean worldClass;
	private int workYear;
	private int trophies;

	public Coach(String ime, String prezime, String jmbg, String adresa, double annualEarnings, String sponsor,
			int workYear, int trophies) {
		super(ime, prezime, jmbg, adresa);
		this.annualEarnings = annualEarnings;
		this.sponsor = sponsor;
		this.workYear = workYear;
		this.trophies = trophies;
		this.worldClass = isWorldClass();
		}

	public double getAnnualEarnings() {
		return annualEarnings;
	}

	public void setAnnualEarnings(double annualEarnings) {
		this.annualEarnings = annualEarnings;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getWorkYear() {
		return workYear;
	}

	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public void setWorldClass(boolean worldClass) {
		this.worldClass = worldClass;
	}

	private boolean isWorldClass() {
		if(this.trophies > 15 && this.workYear > 20) {
			return true;
		} return false;
	}

	@Override
	public String toString() {
		return "Coach [annualEarnings=" + annualEarnings + ", sponsor=" + sponsor + ", worldClass=" + worldClass
				+ ", trophies=" + trophies + "]";
	}
}
