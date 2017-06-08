package co.com.examples;

public class RecorrerArrayDeNumerosKATA {

	public static void main(String[] args) {
		int[] numerosArray = new int[11];
		numerosArray[0] = 0;
		numerosArray[1] = 1;
		numerosArray[2] = 2;
		numerosArray[3] = 3;
		numerosArray[4] = 4;
		numerosArray[5] = 5;
		numerosArray[6] = 6;
		numerosArray[7] = 7;
		numerosArray[8] = 8;
		numerosArray[9] = 9;
		numerosArray[10] = 10;

		// VERSIONES ANTERIORES: Recorrer una lista de numeros.
		System.out.println("VERSIONES ANTERIORES:");
        for (Integer numero : numerosArray) {
			System.out.print(numero + " ");
		}
        
        System.out.println("\n\nJAVA 8:");
        // JAVA 8: Recorrer una lista de numeros.

        
        System.out.println("");
	}

}
