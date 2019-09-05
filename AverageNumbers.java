import java.util.Scanner;


public class AverageNumbers {

	public static void main(String[] args) {
		
		int 	numPos = 0;	//number of positive integers entered.
		double 	avgPos = 0;	//avg of the positive integers entered.
		int 	SumPos = 0;	//total of the positive integers entered
		int 	numNeg = 0;	//number of negative integers entered.
		double 	avgNeg = 0;	//avg of the negative integers entered.
		int 	SumNeg = 0;	//total of the negative integers entered
		int 	userNumber = 0;			
		
		System.out.print("Please enter an integer:");
		Scanner Input = new Scanner(System.in);  // user input is saved in variable called Input;
		userNumber = Input.nextInt(); //make userNumber equal to the int value of user input
		
		while (userNumber != 0) {
			if (userNumber > 0) {
				numPos++; //increase the count of the number of positive integers entered
				SumPos = SumPos + userNumber;	// add the userNumber to the total of the pos integers
				
			}	//end of if for positive values
			
			else if (userNumber < 0) {
				numNeg++; //increase the count of the number of negative integers entered
				SumNeg = SumNeg + userNumber;	// add the userNumber to the total of the negative integers
			}
						
			System.out.print("Please enter an integer:");
			userNumber = Input.nextInt(); //make userNumber equal to the int value of the user input
		
		}	//end of while loop
				
		avgPos = SumPos/numPos;
		avgNeg = SumNeg/numNeg;
		System.out.println("The total of all the positive intgers entered is " + SumPos + " and the average is " + avgPos);
		System.out.println("The total of all the negative intgers entered is " + SumNeg + " and the average is " + avgNeg);
		
		Input.close();  //closes the scanner input class
	}	//end of method main

}	//end of class AverageNumbers
