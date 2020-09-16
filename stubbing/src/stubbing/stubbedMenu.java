package stubbing;
import java.util.Scanner; 

class function {
	// a function to add 2 numbers
	public int add() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to find the difference of 2 numbers
	public int subtract() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to multiply 2 numbers
	public int multiply() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to divide one number by another number
	public int divide() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to find the average of many numbers
	public int average() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to turn a number with a decimal into a fraction
	public String fraction() {
		System.out.println(" WARNING: function not complete! ");
		return null;
	}
	
	// a function to square a number
	public int square() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to find the square root of a number
	public int squareRoot() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
	
	// a function to find the lowest common denominator of 2 numbers
	public int lowestCommonDenominator() {
		System.out.println(" WARNING: function not complete! ");
		return 0;
	}
}

public class stubbedMenu {
	public static void main (String[] args) {
		System.out.println("Please select a menu item by typing a number between 1 and 10.");
        Scanner sc = new Scanner(System.in); 
        
        int i = 0; // an integer to hold the current input value
		
		do {
			System.out.println(" ");
			System.out.println("  1. add ");
			System.out.println("  2. subtract ");
			System.out.println("  3. multiply ");
			System.out.println("  4. divide ");
			System.out.println("  5. average ");
			System.out.println("  6. display fraction value ");
			System.out.println("  7. square ");
			System.out.println("  8. square root ");
			System.out.println("  9. lowest common denominator ");
			System.out.println(" 10. exit the program ");
			
			i = sc.nextInt();
			
			// error for invalid input
			if (i > 10 || i < 0) {
				System.out.println("Oops! thats not a valid input. ");
				System.out.println("Please select a menu item by typing a number between 1 and 10.");
			}
			
			// function calling per users choice
			if (i == 1) {
				function addition = new function();
				addition.add();
			}
			
			if (i == 2) {
				function subtraction = new function();
				subtraction.subtract();
			}
			
			if (i == 3) {
				function multiplication = new function();
				multiplication.multiply();
			}
			
			if (i == 4) {
				function divition = new function();
				divition.divide();
			}
			
			if (i == 5) {
				function mean = new function();
				mean.average();
			}
			
			if (i == 6) {
				function fractionValue = new function();
				fractionValue.fraction();
			}
			
			if (i == 7) {
				function squareValue = new function();
				squareValue.square();
			}
			
			if (i == 8) {
				function squareRootValue = new function();
				squareRootValue.squareRoot();
			}
			
			if (i == 9) {
				function commonDenominator = new function();
				commonDenominator.lowestCommonDenominator();
			}
			
		} while (i != 10);
		
	}
}
