package co.com.tutorial6;

import java.util.Arrays;

public class MethodReferences {

	public static void referenciarMetodoStatic() {
		System.out.println("Método referido Static");
	}
	
	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nombres = {"Mauricio", "Casa", "Jota"};
		
//		Arrays.sort(nombres, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
//		System.out.println(Arrays.toString(nombres));
		
		// JAVA 8 - Ordenar con expresion lamda.
//		Arrays.sort(nombres, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
//		System.out.println(Arrays.toString(nombres));
		
		// JAVA 8 - Ordenar con referencia de metodos.
		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));		
	}
	
	public void referenciarConstructor() {
		IPersona iper = new IPersona() {

			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id, nombre);
			}
			
		};
		
		// JAVA 8 - Ordenar con expresion lamda.
//		IPersona iper = (x, y) -> (new Persona(x, y));
		
		// JAVA 8 - Ordenar con referencia de metodos.
//		IPersona iper = Persona::new;
		
		Persona per = iper.crear(1, "Mao");
		System.out.println(per.getId() + " - " + per.getNombre());
	}
	
	public void operar() {
		Operacion op = () -> MethodReferences.referenciarMetodoStatic();
		op.saludar();
		
		// JAVA 8 - Utilizando referencia de metodos.
//		Operacion op = MethodReferences::referenciarMetodoStatic;
//		op.saludar();
	}
	
	public static void main(String[] arg) {
		MethodReferences methodReferences = new MethodReferences();
		methodReferences.operar();
		methodReferences.referenciarMetodoInstanciaObjetoArbitrario();
//		methodReferences.referenciarConstructor();
	}
}
