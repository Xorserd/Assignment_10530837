import java.util.Scanner;
import java.util.Random;

class KeepGuessing 
{
	public static void main (String [] args)
	{
		Random myr = new Random();
		Scanner myinput = new Scanner(System.in);
			
		System.out.print (" I have chosen a number between 1 to 10. Try to guess it.  \n Your guess: ");

		int response = myinput.nextInt();
	
		int myguess = myr.nextInt(10);

		while ( myguess != response )
		{
			System.out.println (" That is incorrect. Guess again ");
			myguess = myinput.nextInt();

		}	

			System.out.println (" That's right! You're a good guesser " );
		
	}
}
