package co.com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecorrerAlmacenarEnNuevaListaKATA {

	public static void main(String[] args) {
		
		// VERSIONES ANTERIORES: Recorrer una lista de numeros.
		List<Integer> listaNumeros = new ArrayList<>();
		List<Integer> mayores = new ArrayList<>();
		
		listaNumeros = (List<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Filtrar los número mayores que 5 y añadirlos en la lista mayores.
		for (Integer numero : listaNumeros) {
			if (numero>5) {
				mayores.add(numero);
			}
		}
		
		// Imprimir la lista con los números mayores que 5
		System.out.println("VERSIONES ANTERIORES:");
		for (Integer integer : mayores) {
			System.out.print(integer + " ");
		}

        System.out.println("\n\nJAVA 8:");
        // JAVA 8: Recorrer una lista de numeros.
        
		
        System.out.println("");
	}
}
