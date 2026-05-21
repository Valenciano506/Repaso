package Repaso;

/*
 *
 * @author Valenciano
 * 21 may 2026
 */
public class Algorithm3 {
	
	public static void main(String[] args) {
		
		//Create an array with a capacity of 6
		int[] integers = {2, 23, 34, 45, 56, 67};
		System.out.println(integers.length);
		//Create an array with capacity 20000
		int[] ints = new int[20000];
		ints[499] = 34234;
		System.out.println(ints[499]);
		float[] fls = {324, 432};
		Calculator[] cls = {new Calculator(), new Calculator()};
		System.out.println(cls[0]);
		System.out.println(cls[1]);
		
		System.out.println(integers[5]);
		
	}

}
