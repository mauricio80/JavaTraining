package co.com.tutorial4;

public class ScopesKATA {
	
	private static double atributo1;
	private double atributo2;
	
	public double probarLocalVariable() {
		double n3 = 3;
		Operacion op = new Operacion() {
			@Override
			public double calcular(double n1, double n2) {
				return n1 + n2 + n3;
			}			
		};
		
		// JAVA 8
		
		return op.calcular(1, 1);
	}
	
	public double probarAtributosStaticos() {
	
		Operacion op = new Operacion() {
			@Override
			public double calcular(double n1, double n2) {
				atributo1 = n1 + n2;
				atributo2 = atributo1;
				return atributo2;
			}			
		};
		
		// JAVA 8

		
		return op.calcular(1, 1);
	}
	
	public static void main(String[] arg) {
		ScopesKATA scopes = new ScopesKATA();
		scopes.probarLocalVariable();
	}
}
