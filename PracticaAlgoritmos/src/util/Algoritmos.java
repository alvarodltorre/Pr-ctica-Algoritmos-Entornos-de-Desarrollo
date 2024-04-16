package util;

public abstract class Algoritmos {

	/**
	 * Recibe un número entero y devuelve el factorial del numero especificado
	 * 
	 * @param numero el numero del que queremos calcular el factorial
	 * @return el factorial del numero especificado
	 */
	public static int factorial(int numero) {
		int factorial = 1;
		for (int i = 1; i < numero; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	
	
	/**
	 * Recibe un número entero y devuelve true o false en función de si es primo o no.
	 * 
	 * @param numero el numero del que queremos saber si es primo o no.
	 * @return true o false en función de si es primo o no el numero especificado
	 */
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

}
