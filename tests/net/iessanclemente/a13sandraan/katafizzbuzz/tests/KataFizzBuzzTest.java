package net.iessanclemente.a13sandraan.katafizzbuzz.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import net.iessanclemente.a13sandraan.katafizzbuzz.KataFizzBuzz;

public class KataFizzBuzzTest {
	
	/**
	 * Creamos una variable para la clase KataFizzBuzz.
	 */
	public static KataFizzBuzz methods;
	
	/**
	 * Con la variable anterior creamos un nuevo objeto.
	 */
	@Before
	public void setUp() throws Exception{
		methods = new KataFizzBuzz();
	}

	/**
	 * Test para cuando el numero es multiplo de 3, tiene que devolver 'Fizz'.
	 */
	@Test
	public void multiploTres(){
		String result = methods.fizzbuzz(3);
		assertEquals("Fizz", result);
	}
	
	/**
	 * Test para cuando el numero es multiplo de 5, tiene que devolver 'Buzz'.
	 */
	@Test
	public void multiploCinco(){
		String result = methods.fizzbuzz(5);
		assertEquals("Buzz", result);
	}
	
	/**
	 * Test para cuando el numero es multiplo de 3 y 5, tiene que devolver 'FizzBuzz'.
	 */
	@Test
	public void multiploTresCinco(){
		String result = methods.fizzbuzz(15);
		assertEquals("FizzBuzz", result);
	}
	
	/**
	 * Test para cuando el numero contiene 5 devuelva 'Buzz'.
	 */
	@Test
	public void contieneCinco(){
		String result = methods.fizzbuzz(52);
		assertEquals("Buzz", result);
	}
}
