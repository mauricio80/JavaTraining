package co.com.tutorial2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaAppKATA {
	
	public void ordernar() {
		
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Code");
		lista.add("Mito");

		// JDK < 1.8
		/*
		 * Collections.sort(lista, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareTo(o2); }
		 * 
		 * });
		 */

		// Lambda JAVA 1.8
		

		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

	public void calcular() {
		/*Operacion operacion = new Operacion() {
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1 + n2) / 2;
			}
		};
		System.out.println(operacion.calcularPromedio(2, 3));*/
				
		// Lambda JAVA 1.8
		

	}

	public static void main(String[] args) {
		LambdaAppKATA app = new LambdaAppKATA();
		//app.ordernar();
		app.calcular();
	}
}
