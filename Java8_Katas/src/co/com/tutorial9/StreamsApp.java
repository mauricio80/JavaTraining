package co.com.tutorial9;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp() {
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
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out :: println);
	}
	
	/**
	 * Sort the list ascendingly.
	 */
	public void sortAscendingly() {
		lista.stream().sorted().forEach(System.out :: println);
	}
	
	/**
	 * Sort the list in descending order.
	 */
	public void sortDown() {
		lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out :: println);
	}
	
	/**
	 * List in upper case way.
	 */
	public void transform() {
		lista.stream().map(String :: toUpperCase).forEach(System.out :: println);
	}
	
	/**
	 * Increase in one the number list.
	 */
	public void increaseInOne() {
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out :: println);
	}
	
	/**
	 * Limit the number list.
	 */
	public void limit() {
		numeros.stream().limit(2).forEach(System.out :: println);
	}
	
	public static void main(String[] args) {
		StreamsApp streamsApp = new StreamsApp();
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
