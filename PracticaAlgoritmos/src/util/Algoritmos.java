package util;

public abstract class Algoritmos {

	/**
	 * Recibe un número entero y devuelve el factorial del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el factorial
	 * @return			el factorial del numero especificado
	 */
	public static int factorial(int numero) {
		int factorial = 1;
		for (int i = 1; i < numero; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
