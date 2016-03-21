import java.util.Scanner;
import java.util.Random;

class NumberGuessingWithACounter
{
	public static void main (String [] args)
	{
		Random myr = new Random();
		Scanner myinput = new Scanner(System.in);
			
		System.out.print (" I have chosen a number between 1 to 10. Try to guess it.  \n Your guess: ");

		int response = myinput.nextInt();
	
		int myguess = myr.nextInt(10);
		int n=0;
		int trials=0;
		int response2= 0;
		
		

	while( response<10)
		{
			if ( myguess == response || myguess == response2)
			{
				System.out.println ( " That's right! You're a good guesser. " );
				break;
			}

			else if (myguess!=response2)
			{
			System.out.print( " That is incorrect. Guess again: " ) ; 
			response2 = myinput.nextInt();
			trials++;
			}

			

		}
System.out.println (" It only took you " + trials + " tries" );

	}
}
