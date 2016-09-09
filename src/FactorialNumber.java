import java.util.Scanner;

public class FactorialNumber {

	//add a main to execute the code we write within it
    public static void main(String[] args) {
    	
    	//initializing the instance variables used in the
		// application
    	
    	int num = 0;
		long factorial = 1;
		String choice = "y";


		
		// Get input from user
				Scanner scan = new Scanner(System.in);
				
				// welcome message for the user
				System.out.println("Welcome to the Factorial Calculator!");
				
				//enter the while loop
				while (choice.equalsIgnoreCase("y")) {
					
					// prompt the user to enter an integer
					System.out.println("Enter an integer that's greater than 0 but less than 10: ");

					
					// store the user input data into the int variable 'num'
					num = scan.nextInt();

					//you will only enter the  'if-statement' when the condition of both the
					//  value stored in the integer variable 'num' is greater > than 0 AND is
					//<= less than or equal to 10. BOTH conditions must evaluate to true
					//  in order to enter the 'if-statement
					
					if (num > 0 && num <= 10) {
						
						long result = 1; // declare and initialize a local variable 
						
						// enter the 'for-loop' by initializing the int variable 'i' with the value "1"
						for (int i = 1; i <= num; i++) {
							result = (result * i);
							factorial = result;
							
						}//exit the 'for-loop

						//display the factorial of the user input data value to the console
						System.out.println("The factorial of " + num + " is "
								+ factorial);

						//enter the 'else-statement'  the block of code that will run if the if statement is false
				
						}else{System.out.println("Please enter an integer that's greater than 0 but less than 10: ");
						
						
					}
					System.out.println("Continue? (y/n): ");
					choice = scan.next();

					// exit the 'while-loop' and close the scanner 
				}
				


				System.out.println("Bye!");
				scan.close();

	}// this brace closes the main method

}// this brace closes the class
