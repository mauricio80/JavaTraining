package co.com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecorrerAlmacenarEnNuevaLista {

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
        
		mayores = listaNumeros
				// se crea el stream
				.stream()
				//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
				.filter(x -> x > 5)
				//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
				.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
 
		mayores.forEach(e -> System.out.print(e + " "));
        System.out.println("");
	}
}
