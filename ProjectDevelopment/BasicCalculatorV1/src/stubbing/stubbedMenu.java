package stubbing;
import java.util.InputMismatchException;
import java.util.Scanner; 
import java.lang.Math;

class function {
	// a function to add 2 numbers
	public int add(int x, int y) {
		int answer;
		answer = x+y;
		System.out.println(x + "+" + y + " = " + answer);
		return 0;
	}
	
	// a function to find the difference of 2 numbers
	public int subtract(int x, int y) {
		int answer;
		answer = x-y;
		System.out.println(x + "-" + y + " = " + answer);
		return 0;
	}
	
	// a function to multiply 2 numbers
	public int multiply(int x, int y) {
		int answer;
		answer = x*y;
		System.out.println(x + "*" + y + " = " + answer);
		return 0;
	}
	
	// a function to divide one number by another number
	public int divide(double x, double y) {
		double answer; 
		answer = x/y;
		System.out.println(Math.round(x) + "/" + Math.round(y) + " = " + answer);
		return 0;
	}
	
	// a function to find the average of 2 numbers
	public int average(double x, double y) {
		double answer;
		answer = (x+y)/2;
		System.out.println("average of " + Math.round(x) + " & " + Math.round(y) + " = " + answer);
		return 0;
	}
	
	// a function to turn a number with a decimal into a fraction
	public String fraction(double x) {
		double startX = x;
		String stringX = String.valueOf(x);
		int digitsDec = stringX.length() - 1 - stringX.indexOf('.');
		int denominator = 1;
		for (int i=0; i<digitsDec; i++) {
			x *= 10;
			denominator *=10;
		}
		int numorator = (int) Math.round(x);
		int gcd=1;
		for(int i = 1; i <= numorator && i <= denominator; i++)
        {
            if(numorator%i==0 && denominator%i==0)
                gcd = i;
        }
		numorator = numorator/gcd;
		denominator = denominator/gcd;
		String answer = String.valueOf(numorator) + '/' + String.valueOf(denominator);
		System.out.println("fraction value of " + startX  + " = " + answer);
		return null;
	}
	
	// a function to square a number
	public int square(int x) {
		int answer;
		answer = x*x;
		System.out.println("square of " + x + " = " + answer);
		return 0;
	}
	
	// a function to find the square root of a number
	public int squareRoot(double x) {
		double answer;
		answer = Math.sqrt(x);
		System.out.println("square root of " + Math.round(x) + " = " + answer);
		return 0;
	}
	
	// a function to find the lowest common denominator of 2 numbers
	public int greatestCommonDenominator(int x, int y) {
		int answer=1;
		for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                answer = i;
        }
		System.out.println("greatest common denominator of " + Math.round(x) + " & " + Math.round(y) + " = " + answer);
		return 0;
	}
}

public class stubbedMenu {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        int choice = 0;
		
		do {
			System.out.println(" ");
			System.out.println("Please select a menu item by typing a number between 1 and 10.");
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
			
			boolean error = false;
			
			do {
				try {
					choice = sc.nextInt();
					error=false;
				} catch(InputMismatchException exception) {
					System.out.println("Oops! thats not a valid input. ");
					System.out.println(" ");
					System.out.println("Please select a menu item by typing a number between 1 and 10.");
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
					sc.next();
					error=true;
				}
			} while (error == true);
			
			// error for invalid integer input
			if (choice > 10 || choice < 1) {
				System.out.println("Oops! thats not a valid input. ");
			}
			
			// function calling per users choice
			if (choice == 1) {
				System.out.println("*** addition ***");
				function addition = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				addition.add(x, y);
			}
			
			if (choice == 2) {
				System.out.println("*** subtraction ***");
				function subtraction = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				subtraction.subtract(x, y);
			}
			
			if (choice == 3) {
				System.out.println("*** multiplication ***");
				function multiplication = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				multiplication.multiply(x, y);
			}
			
			if (choice == 4) {
				System.out.println("*** division ***");
				function divition = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				divition.divide(x, y);
			}
			
			if (choice == 5) {
				System.out.println("*** average value ***");
				function mean = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				mean.average(x, y);
			}
			
			if (choice == 6) {
				System.out.println("*** decimal to fraction ***");
				function fractionValue = new function();
				System.out.println("Please enter a number: ");
				double x = 0;
				do {
					try {
						x = sc.nextDouble();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter a number. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				fractionValue.fraction(x);
			}
			
			if (choice == 7) {
				System.out.println("*** square value ***");
				function squareValue = new function();
				System.out.println("Please enter a number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				squareValue.square(x);
			}
			
			if (choice == 8) {
				System.out.println("*** square root value ***");
				function squareRootValue = new function();
				System.out.println("Please enter a number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				squareRootValue.squareRoot(x);
			}
			
			if (choice == 9) {
				System.out.println("*** greatest common denominator ***");
				function commonDenominator = new function();
				System.out.println("Please enter the first (of 2) number: ");
				int x = 0;
				do {
					try {
						x = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				System.out.println("Please enter the second (of 2) number: ");
				int y = 0;
				do {
					try {
						y = sc.nextInt();
						error=false;
					}
					catch(InputMismatchException exception) {
						System.out.println("Oops! thats not a valid input. Please enter an integer. ");
						sc.next();
						error=true;
					}
				}
				while (error == true);
				commonDenominator.greatestCommonDenominator(x, y);
			}
			
		} while (choice != 10);
		
		sc.close();
	}
}
