package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets"));
		caisses.add(new Caisse("Moyens objets"));
		caisses.add(new Caisse("Grands objets"));
	}

	public void addItem(Item item) {
		//TODO Faites évoluer ce code (idée: c'est la caisse qui doit "savoir" si elle peut accepter un objet ou non)
		
		//caisses.get(1).getItems().add(item);
		for(Caisse c : caisses) {
			c.verifCaisse(item.getPoids());
		}
		
	}

	public int taille() {
		int taille = 0;
		//TODO faites évoluer ce code.
		for(Caisse c : caisses ) {
			taille+= c.getItems().size();
		}
		return taille;
	}
	
	
}
