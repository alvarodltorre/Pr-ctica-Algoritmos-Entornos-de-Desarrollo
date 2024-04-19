package app;


public class Principal {

	public static void main(String[] args) {
		// Creamos los arrays del Main
		int numeros[] = new int[5];
		int resultadoFibonacci[] = new int[5];
		int resultadoFactorial[] = new int[5];
		boolean resultadoPrimos[] = new boolean[5];

		// Rellenamos el array numeros con numeros aleatorios entre 1 y 10.
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
		}

		// Bucle Fibonacci
		for (int i = 0; i < resultadoFibonacci.length; i++) {

			resultadoFibonacci[i] = util.Algoritmos.fibonacci(numeros[i]);
		}

		// Bucle Factorial
		for (int i = 0; i < resultadoFactorial.length; i++) {

			resultadoFactorial[i] = util.Algoritmos.factorial(numeros[i]);
		}

		// Bucle numeros Primos
		for (int i = 0; i < resultadoPrimos.length; i++) {

			resultadoPrimos[i] = util.Algoritmos.esPrimo(numeros[i]);
		}

	}

}