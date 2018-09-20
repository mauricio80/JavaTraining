package co.com.tutorial8;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAppKATA {

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

	}
	
	// JAVA 8
	/**
	 * Remove the element with value "B".
	 */
	public void usarRemoveIf() {

	}
	
	// JAVA 8
	/**
	 * Sort items.
	 */
	public void usarSort() {

	}
	
	public static void main(String[] arg) {
		ColeccionAppKATA coleccionApp = new ColeccionAppKATA();
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
