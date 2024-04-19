package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Algoritmos;

public class JUnit {

	@Test
	public void factorial() {
		int factEsperada=720;
		int factObtenida = Algoritmos.factorial(6);
		assertEquals(factEsperada, factObtenida);

}
	@Test
	public void fibonacci() {
		int fiboEsperada=89;
		int fiboObtenida = Algoritmos.fibonacci(11);
		assertEquals(fiboEsperada, fiboObtenida);

}
	@Test
	public void esPrimo() {
		boolean esPrimoEsperada=false;
		boolean esPrimoObtenida = Algoritmos.esPrimo(10);
		assertEquals(esPrimoEsperada,esPrimoObtenida);

}
}

