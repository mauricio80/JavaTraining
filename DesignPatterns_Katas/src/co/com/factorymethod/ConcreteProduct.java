package co.com.factorymethod;

public class ConcreteProduct implements Product {
	
	// Operation.
	@Override
	public void operation() {
        System.out.println("An operation of this product.");
    }
}
