package co.com.factorymethod;

public class ConcreteCreator extends Creator {
	
	public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
