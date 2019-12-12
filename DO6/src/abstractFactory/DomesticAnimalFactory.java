package abstractFactory;

public class DomesticAnimalFactory implements AnimalFactory{

	@Override
	public Animal createAnimal(String type) {
		if (type.equals("dog")) {
			return new Dog();
		} else if (type.equals("cow")) {
			return new Cow();
		} else {
			return null;
		}
	}

}
