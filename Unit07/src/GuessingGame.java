//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}
	
	public void setUpperBound(int stop){
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int randNum = r.nextInt(upperBound - 1) + 1;
		int counter = 0;
		int userNum = 0;

		while(userNum != randNum){
			System.out.println("Enter a number between 1 and " + upperBound + ":");
			userNum = keyboard.nextInt();
			if(userNum >= 1 && userNum < upperBound){
				counter++;
			} else {
				System.out.println("Number is out of range!");
			}
		}
		System.out.println("It took " + counter + " guesses to guess " + randNum + ". You guessed wrong " + (counter - 1) * 100 / upperBound + "% of the time.");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}