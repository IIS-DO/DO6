package abstractFactory;

public abstract class FactoryForAnimalFactory {
	
	public static AnimalFactory createAnimalFactory(String type) {
		switch(type) {
		case "wild":
			return new WildAnimalFactory();
		case "domestic":
			return new DomesticAnimalFactory();
		default:
			return null;
		}
	}

}
