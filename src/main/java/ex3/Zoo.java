package ex3;

import java.util.List;



public class Zoo {
	/**
	 * List d'animaux
	 */
	private List<Animal> animaux;
	private String nom;
	
	
	/**
	 *Constuteur
	 * 
	 *@param nom nom du zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**Methode qui ajoute un animal a la liste
	 * @param ani animal
	 */
	public void addAnimal(Animal ani){
		animaux.add(ani);
	}
	
	/**
	 * Affiche tout les Animaux de la liste du zoo
	 */
	public void afficherListeAnimaux(){
		for(Animal i : animaux) {
			System.out.println(i.getNoms()+" "+i.getTypes()+" "+i.getComportements());			
		}
	}
	
	/**
	 * Retourne la taille de la liste d'animaux
	 * @return int
	 */
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
