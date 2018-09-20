package co.com.tutorial8;

import java.util.ArrayList;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;
	
	public void llenarLista() {
		lista = new ArrayList<>();
		lista.add("C");
		lista.add("B");
		lista.add("A");		
	}
	
	// JAVA 8
	/**
	 * Print all elements.
	 */
	public void usarForEach() {
		lista.forEach(System.out :: println);
	}
	
	// JAVA 8
	/**
	 * Remove the element with value "B".
	 */
	public void usarRemoveIf() {
		lista.removeIf(x -> x.equalsIgnoreCase("B"));
	}
	
	// JAVA 8
	/**
	 * Sort items.
	 */
	public void usarSort() {
		lista.sort((x, y) -> x.compareTo(y));
	}
	
	public static void main(String[] arg) {
		ColeccionApp coleccionApp = new ColeccionApp();
		coleccionApp.llenarLista();
		System.out.println("==========");
		coleccionApp.usarForEach();
		System.out.println("==========");
		coleccionApp.usarRemoveIf();
		coleccionApp.usarForEach();
		System.out.println("==========");
		coleccionApp.usarSort();
		coleccionApp.usarForEach();
	}
}
