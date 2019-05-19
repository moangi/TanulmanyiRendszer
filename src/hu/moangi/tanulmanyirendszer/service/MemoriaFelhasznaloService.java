package hu.moangi.tanulmanyirendszer.service;

import java.util.ArrayList;
import java.util.List;

import hu.moangi.tanulmanyirendszer.model.Felhasznalo;
import hu.moangi.tanulmanyirendszer.util.Felhasznalok;

public class MemoriaFelhasznaloService implements FelhasznaloService {
	
	private Long kovetkezoId = 0L;
	private List<Felhasznalo> felhasznalok = new ArrayList<>();

	public MemoriaFelhasznaloService() {
		ujFelhasznalo(Felhasznalok.ADMIN);
		ujFelhasznalo(Felhasznalok.OKTATO);
	}
	
	@Override
	public List<Felhasznalo> mindenFelhasznalo() {
		return new ArrayList<>(felhasznalok);
	}

	@Override
	public void ujFelhasznalo(Felhasznalo felhasznalo) {
		felhasznalo.setId(kovetkezoId++);
		felhasznalok.add(felhasznalo);
	}

}
