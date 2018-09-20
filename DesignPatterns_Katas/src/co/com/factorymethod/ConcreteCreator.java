package co.com.factorymethod;

public class ConcreteCreator extends Creator {
	
	// FactoryMethod.
	public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
