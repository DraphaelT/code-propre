package ex5;

import java.util.ArrayList;
import java.util.List;


public abstract class Caisse {
	
	private String nom;
	private List<Item> items;
	

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
	}

	public int verifCaisse(int item) {
		if (item < 5) {
			return 0;
		}
		if (item >= 5 && item <= 20) {
			//caisses.get(1).getItems().add(item);
			return 1;
		}
		else
		    //caisses.get(2).getItems().add(item);
			return 2;
		
	}
	
	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public abstract List<Item> getItems(); 

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
