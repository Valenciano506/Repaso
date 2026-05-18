package Repaso;

/*
 *
 * @author Valenciano
 * 8 may 2026
 */
public class VariableTest {

	public static void main(String[] args) {
		// primitive variables
		// aritmethic 
		var num1 = 1.0;
		int num2 = 2;
		//explicit conversion
		int result = (int)(num1 + num2);
		System.out.println(result);
		result = Calculator.sum((int)num1, num2);
		double result2 = num1 / num2;
		result2 = Calculator.division(num1, num2);
		System.out.println(result2);
		System.out.println(Calculator.modulus(3.2f, 2));
		boolean stop = false;
		String color = "Green";
		if(color == "Green") {
			stop = false;
		}
		System.out.println(stop);
		// reference variables
		
	}
	
}
