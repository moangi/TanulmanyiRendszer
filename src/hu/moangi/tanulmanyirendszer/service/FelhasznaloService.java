package hu.moangi.tanulmanyirendszer.service;

import java.util.List;

import hu.moangi.tanulmanyirendszer.model.Felhasznalo;

public interface FelhasznaloService {
	
	List<Felhasznalo> mindenFelhasznalo();
	
	void ujFelhasznalo(Felhasznalo felhasznalo);

}
