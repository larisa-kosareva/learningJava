import java.util.*;

public class TestGenerics1 {
	public static void main(String[] args) {
		new TestGenerics1().go();
	}

	public void go(){
		//Animal[] animals = {new Dog(), new Cat(), new Dog()};
		//Dog[] dogs = {new Dog(), new Dog(), new Dog()};

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		animals.add(new Dog());
		animals.add(new Dog());
		takeAnimals(dogs);

	}

	public void takeAnimals(ArrayList<Animal> animals) {
		for (Animal a: animals) {
			a.eat();
		}
	}
}