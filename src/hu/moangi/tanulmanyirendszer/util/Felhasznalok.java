package hu.moangi.tanulmanyirendszer.util;

import hu.moangi.tanulmanyirendszer.model.Felhasznalo;
import hu.moangi.tanulmanyirendszer.model.Szerepkor;

public class Felhasznalok {

	public static final Felhasznalo ADMIN;
	public static final Felhasznalo OKTATO;
	
	static {
		ADMIN = new Felhasznalo();
		ADMIN.setFelhasznalonev("admin");
		ADMIN.setNev("Admin Kálmán");
		ADMIN.setEletkor(35);
		ADMIN.setSzerepkor(Szerepkor.ADMIN);
		
		OKTATO = new Felhasznalo();
		OKTATO.setFelhasznalonev("tanarur");
		OKTATO.setNev("Oktató Béla");
		OKTATO.setEletkor(24);
		OKTATO.setSzerepkor(Szerepkor.OKTATO);
	}
	
}
