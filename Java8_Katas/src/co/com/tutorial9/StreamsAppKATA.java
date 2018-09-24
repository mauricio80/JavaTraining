package co.com.tutorial9;

import java.util.ArrayList;
import java.util.List;

public class StreamsAppKATA {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsAppKATA() {
		lista = new ArrayList<>();
		lista.add("Milanta");
		lista.add("Conejo");
		lista.add("Jaime");
		lista.add("Mito");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	/**
	 * Prints only the words that begins with "M".
	 */
	public void filter() {

	}
	
	/**
	 * Sort the list ascendingly.
	 */
	public void sortAscendingly() {

	}
	
	/**
	 * Sort the list in descending order.
	 */
	public void sortDown() {

	}
	
	/**
	 * List in upper case way.
	 */
	public void transform() {

	}
	
	/**
	 * Increase in one the number list.
	 */
	public void increaseInOne() {

	}
	
	/**
	 * Limit the number list.
	 */
	public void limit() {

	}
	
	public static void main(String[] args) {
		StreamsAppKATA streamsApp = new StreamsAppKATA();
		streamsApp.filter();
		System.out.println("==========");
		streamsApp.sortAscendingly();
		System.out.println("==========");
		streamsApp.sortDown();
		System.out.println("==========");
		streamsApp.transform();
		System.out.println("==========");
		streamsApp.increaseInOne();
		System.out.println("==========");
		streamsApp.limit();
		System.out.println("==========");
	}
}
