package ex3;

import ex3.Animal.TypeRegime;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", TypeRegime.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", TypeRegime.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE",TypeRegime.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", TypeRegime.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", TypeRegime.CARNIVORE));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", TypeRegime.OMNIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", TypeRegime.CARNIVORE));
		zoo.addAnimal(new Animal("Python", "SERPENT", TypeRegime.CARNIVORE));
	}

}
