package co.com.factorymethod;

public class Test {
	public static void main(String args[]){
	    Creator concreteCreator;
	    concreteCreator = new ConcreteCreator();
	    Product concreteProduct = concreteCreator.factoryMethod();
	    concreteProduct.operation();
	}
}
