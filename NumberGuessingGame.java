package Generation;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	public static void main(String[] args) {
		//step-2 : Create the objects for both classes
		Scanner obj = new Scanner(System.in);
		Random ran = new Random();
		//step-3 : Declare variables and initialize
		int comGuessNum = ran.nextInt(20)+1;
		int UserGuessNum = 0;
		int numOfGuesses = 1;
		
		//step-4 : Prompt to the user 
		System.out.println("Computer guessed a number between 1 to 10 try to guess and the number what it is");
		//step-5 : Logic
		while(UserGuessNum != comGuessNum) {
			UserGuessNum = obj.nextInt();
			if(UserGuessNum != comGuessNum) {
				System.out.println("User guess is not matched ! please try agein");
				}
			else {
				System.out.println("Congratulations ! your guess is matched in "+numOfGuesses+" attempts");
			}
			numOfGuesses ++;
	
			}
		//Step-6 : Run the program
		obj.close();

	}

}
