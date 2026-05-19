package Repaso;

import java.util.Scanner;

/*
 *
 * @author Valenciano
 * 19 may 2026
 */
public class Algorithm1 {
	
	public static void main(String[] args) {
		
		//Inputs: three numbers, can be represented by three variables
		int a, b, c;
		
		//create a Scanner object to establish communication between our app and the console
		Scanner scan = new Scanner(System.in);
		
		//read the numbers from the console respectively
		System.out.print("Introduce el primer número: ");
		a = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		b = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		c = scan.nextInt();
		
		long startTime = System.nanoTime();
		
		System.out.println("El número combinado es: " + conmbinedDigits(a, b, c));
		
		long endTime = System.nanoTime();
		System.out.println("El tiempo que ha tardado el programa es de " + (endTime - startTime) + " nanosegundos.");
		
		scan.close();
	}

	/**
	 * combine all the digits to form a integer
	 * @param a the highest digit
	 * @param b
	 * @param c the lowest digit
	 * @return the combined integer
	 */
	private static int conmbinedDigits(int a, int b, int c) {
		//validation of the inputs
		//logical operator: or ||, and &&, not !
//		if(a > 9 || a < 0 || b > 9 || b < 0 || c > 9 || c < 0) {
//			System.out.println("Número no válido");
//			//Throw new InvalidArgsException();
//			return 0;
//		}
//		
		//if a is less than 10 and greater than 0 ....
		if(!(a <= 9 && a > 0 && b <= 9 && b >= 0 && c <= 9 && c >= 0)) {
			//if all the conditions are meet
			//if one of the conditions is satisfied
			System.out.println("Número no válido");
			//Throw new InvalidArgsException();
			return 0;
		}
		
		//implementation of the algorithm
//		a = a * 100;
		a *= 100;
		b *= 10;
		
		//output
		return a + b + c;
		
	}

}
