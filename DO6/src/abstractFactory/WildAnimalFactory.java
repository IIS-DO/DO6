package abstractFactory;

public class WildAnimalFactory implements AnimalFactory{

	@Override
	public Animal createAnimal(String type) {
		if (type.equals("bear")) {
			return new Bear();
		} else if (type.equals("dinosaur")) {
			return new Dinosaur();
		} else {
			return null;
		}
	}

}
