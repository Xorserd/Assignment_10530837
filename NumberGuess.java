import java.util.Scanner;
import java.util.Random;

class NumberGuess
{
	public static void main (String [] args)
	{
		Random myr = new Random();
		Scanner myinput = new Scanner(System.in);
			
		System.out.print (" I'm thinking of a number from 1 to 10. \n Your guess: ");

		int response = myinput.nextInt();
	
		int myguess = myr.nextInt(10);


		if ( myguess != response )
		{
			System.out.println (" Sorry, but I was really thinking of " + myguess);


		}	
		else if( myguess== response)
		{
			System.out.println (" Your guess is right, My secret number was " + myguess);
		}

	}
}
