package players;

public abstract class Person implements IOsoba {

	private String ime;
	private String prezime;
	private String jmbg;
	private String adresa;

	public Person() {
	}

	public Person(String ime, String prezime, String jmbg, String adresa) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.adresa = adresa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "Person [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", adresa=" + adresa + "]";
	}

	@Override
	public boolean validacijaJMBG() {
		int digitCounter = 0;
		for (int i = 0; i < this.jmbg.length(); i++) {
			char c = this.jmbg.charAt(i);
			if (!Character.isDigit(c)) {
				System.out.println("JMBG sadrzi samo brojeve u svom formatu!");
				return false;
			} else {
				digitCounter++;
			}
		}
		if (digitCounter == 13) {
			return true;
		} else {
			System.out.println("JMBG mora da ima tacno 13 cifara!");
			return false;
		}
	}

	@Override
	public boolean validacijaAdresa() {
		int space = 0;
		for (int i = 0; i < this.adresa.length(); i++) {
			char c = this.adresa.charAt(i);
			if (Character.isSpaceChar(c)) {
				space = i;
			}
		}
		for (int i = 0; i < this.adresa.length();) {
			char c = this.adresa.charAt(i);
			if (!Character.isLetter(c) || !Character.isSpaceChar(c)) {
				System.out.println("Ulica ne moze sadrzi samo naziv! Ne moze imati brojeve i druge karaktere!");
				return false;
			}
			i++;
		}
		if (!Character.isDigit(this.adresa.charAt(++space))) {
			System.out.println("Broj zgrade mora biti iskljucivo broj!");
			return false;
		}
		return true;
	}
}
