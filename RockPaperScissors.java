import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
			int Scissors = 0;	
			int Rock =  1;
			int Paper = 2;
			int usersChoice;  // number that user will enter
			int ComputersChoice; // random number that the computer will generate
			
			System.out.println("Rock, Paper, Scissors game");
			System.out.print("Please enter a number from 0 to 2 where 0 = Scissors, 1 = Rock, Paper = 2 :");  //Request user to enter a number
			
			
			//Take user input using the scanner class:
			Scanner Input = new Scanner(System.in);  // user input is saved in variable called Input
						
			usersChoice = Input.nextInt();		 //method in scanner class used to convert scanner input into integer.
			
			// generate random number:
			ComputersChoice = (int)(Math.random()*3);
			System.out.println("\nThe computer's choice is " + ComputersChoice);
			
			
		//setting conditions for when computer wins
		if ((ComputersChoice == Scissors) && (usersChoice == Paper)) {  //scissors beats paper  
				System.out.println("Scissors beats Paper. The computer wins!");
				
			} //end of if 1
			
		if ((ComputersChoice == Rock) && (usersChoice == Scissors)) {  //Rock beats scissors   
			System.out.println("Rock beats Scissors. The computer wins!");
			
		} //end of if 2
			
		if ((ComputersChoice == Paper) && (usersChoice == Rock)) {  //Paper beats Rock   
			System.out.println("Paper beats Rock. The computer wins!");
			
		} //end of if 3
				
		
	//setting conditions for when User wins
	if ((usersChoice == Scissors) && (ComputersChoice == Paper)) {  //scissors beats paper  
			System.out.println("Scissors beats Paper. You win!");
			
		} //end of if 1
		
	if ((usersChoice == Rock) && (ComputersChoice == Scissors)) {  //Rock beats scissors   
		System.out.println("Rock beats Scissors. You win!");
		
	} //end of if 2
		
	if ((usersChoice == Paper) && (ComputersChoice == Rock)) {  //Paper beats Rock   
		System.out.println("Paper beats Rock. You win!");
		
	} //end of if 3

	
	//setting conditions for Draw
	if ((usersChoice == Scissors) && (ComputersChoice == Scissors)) {  //scissors beats paper  
			System.out.println("Its a draw!");
			
		} //end of if 1
		
	if ((usersChoice == Rock) && (ComputersChoice == Rock)) {  //Rock beats scissors   
		System.out.println("Its a draw!");
		
	} //end of if 2
		
	if ((usersChoice == Paper) && (ComputersChoice == Paper)) {  //Paper beats Rock   
		System.out.println("Its a draw!");
		
	} //end of if 3			
		Input.close();  // close the scanner input class
			

	} //end of method 'main'

} //end of class RockPaperScissors
