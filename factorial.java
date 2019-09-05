import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int factorial = 1;
		int Num =0;
		//int n = 0;
		System.out.print("Please enter a positive number:");
		//get the input from the user using the scanner
		Scanner Number = new Scanner(System.in);
		Num = Number.nextInt();
		
		for (int n=1; n <= Num; n++) { //n is the variable to initialise, Num is the max value and n is the variable we need to increment
			factorial *= n;
		}
		
		
		System.out.println("\nThe factorial of " + Num + " is " + factorial);
	}//end of method main

}//end of class AverageNumbers
