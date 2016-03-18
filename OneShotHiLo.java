import java.util.Scanner;
import java.util.Random;

class OneShotHiLo
{
	public static void main (String args[])
	{
		System.out.print (" I'm thinking of a number between 1-100. Try to guess it. \n >");
		Scanner input= new Scanner(System.in);
		int myinput = input.nextInt();
		
		Random myRand = new Random();
		int myGuess = myRand.nextInt(100);
		

		if ( myinput < myGuess )
		{
			System.out.println(" Sorry, you are too low. I was thinking of: " + myGuess);
		}
		
		else if  (myinput > myGuess )
		{
			System.out.println(" Sorry, you are too high. I was thinking of: " + myGuess);
		}
		
		
		
		
	}
}
