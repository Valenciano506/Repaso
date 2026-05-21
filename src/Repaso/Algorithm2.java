/**
 * 
 */
package Repaso;

/*
 *
 * @author Valenciano
 * 20 may 2026
 */
public class Algorithm2 {
	
	public static void main(String[] args) {
		
		boolean stop = false;
		String semaphoreState = "WD40";
		//Simulation of street crossing for a robot
		crossStreet(semaphoreState);
		
		crossStreet("Green");
		crossStreet("Yellow");
		crossStreet("Red");
		crossStreet("Black");
		
		System.out.println(stop);
		
	}

	private static void crossStreet(String semaphoreState) {
		
		if(semaphoreState == "Green") {
			System.out.println("Cross the street");
		}
		else if(semaphoreState == "Yellow" || semaphoreState == "Red") {
			System.out.println("Wait for green");
		}
		else if(semaphoreState == "Black"){
			System.out.println("Contact with traffic office");
		}
		else {
			System.out.println("Unknown inputs, leave the task");
		}
		
		
	}

}
