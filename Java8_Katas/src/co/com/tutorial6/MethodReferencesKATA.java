package co.com.tutorial6;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferencesKATA {

	public static void referenciarMetodoStatic() {
		System.out.println("Método referido Static");
	}
	
	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nombres = {"Mauricio", "Casa", "Jota"};
		
		Arrays.sort(nombres, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		System.out.println(Arrays.toString(nombres));
		
		// JAVA 8 - Ordenar con expresion lamda.

		
		
		// JAVA 8 - Ordenar con referencia de metodos.

		
	}
	
	public void referenciarConstructor() {
		IPersona iper = new IPersona() {

			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id, nombre);
			}
			
		};
		
		// JAVA 8 - Ordenar con expresion lamda.

		
		// JAVA 8 - Ordenar con referencia de metodos.

		
		Persona per = iper.crear(1, "Mao");
		System.out.println(per.getId() + " - " + per.getNombre());
	}
	
	public void operar() {
		Operacion op = () -> MethodReferencesKATA.referenciarMetodoStatic();
		op.saludar();
		
		// JAVA 8 - Utilizando referencia de metodos.

		
	}
	
	public static void main(String[] arg) {
		MethodReferencesKATA methodReferences = new MethodReferencesKATA();
		methodReferences.operar();
		methodReferences.referenciarMetodoInstanciaObjetoArbitrario();
//		methodReferences.referenciarConstructor();
	}
}
