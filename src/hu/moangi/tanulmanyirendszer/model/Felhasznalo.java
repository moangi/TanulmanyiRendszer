package hu.moangi.tanulmanyirendszer.model;

public class Felhasznalo {
	private Long id;

	private String felhasznalonev;

	private String nev;

	private Szerepkor szerepkor;

	private int eletkor;

	private String jelszo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFelhasznalonev() {
		return felhasznalonev;
	}

	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public Szerepkor getSzerepkor() {
		return szerepkor;
	}

	public void setSzerepkor(Szerepkor szerepkor) {
		this.szerepkor = szerepkor;
	}

	public int getEletkor() {
		return eletkor;
	}

	public void setEletkor(int eletkor) {
		this.eletkor = eletkor;
	}

	public String getJelszo() {
		return jelszo;
	}

	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	@Override
	public String toString() {
		return "Felhasznalo [id=" + id + ", felhasznalonev=" + felhasznalonev + ", szerepkor=" + szerepkor + "]";
	}
	
}
