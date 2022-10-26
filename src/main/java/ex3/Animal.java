package ex3;

import java.util.List;

public class Animal {
	
	public enum TypeRegime{
		HERBIVORE,
		OMNIVORE,
		CARNIVORE;
	}
	private String types;
	private String noms;
	private TypeRegime comportements;
	
	/**
	 *Constuteur d'un Animal
	 * 
	 *@param types String type d'animal
	 *@param noms String le nom de l'animal
	 *@param comportements Le type de Regime
	 */
	public Animal(String types, String noms, TypeRegime comportements) {
		super();
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}

	/**
	 * @return String du type de l'animal
	 */
	public String getTypes() {
		return types;
	}

	/**
	 * @return String de nom de l'animal
	 */
	public String getNoms() {
		return noms;
	}

	/**
	 * @return un Type de regime
	 */
	public TypeRegime getComportements() {
		return comportements;
	}
	
	
	
}
