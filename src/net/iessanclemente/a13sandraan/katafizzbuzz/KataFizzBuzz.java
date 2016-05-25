package net.iessanclemente.a13sandraan.katafizzbuzz;

public class KataFizzBuzz {

/**
 * Generamos los numeros del 1 al 100 llamando al metodo numeros() de la clase KataFizzBuzzMethods.
 */
	
	public static void main(String[] args) {
		for(int i=1; i<=100;i++){
			System.out.println(fizzbuzz(i));
		}
	}
	
/**
 * A este metodo recibe un numero.
 * Si el numero recibido es multiplo de 3 devolvemos 'Fizz'
 * Si el numero recibido es multiplo de 5 devolvemos 'Buzz'
 * Si el numero recibido es multiplo tanto de 3 como de 5 devolvemos 'FizzBuzz'
 * Si no es multiplo devolvemos el numero.
 * @param num: integer con un numero del 1 al 100
 * @return : 'Fizz' o 'Buzz' o 'FizzBuzz'
 */
	
	public static String fizzbuzz(int num){
		String resultado = ""+num;
		if(num%3 == 0 && num%5 == 0){
			resultado = "FizzBuzz";
		}else if(num%3 == 0 || (num+"").contains("3")){
			resultado = "Fizz";
		}else if(num%5 == 0){
			resultado = "Buzz";
		}
		return resultado;
	}
}
