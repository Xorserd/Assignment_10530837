import java.util.Scanner;
import java.util.Random;

class HiLoLimited
{
	public static void main (String [] args)
	{
		Random myr = new Random();
		Scanner myinput = new Scanner(System.in);
			
		System.out.print (" I'm thinking of a number between 1-100. You have 7 guesses. \n First guess: ");

		int response = myinput.nextInt();
	
		int myguess = 1+ myr.nextInt(100);
		int n=2;
		int trials=0;
		int response2= 0;
		
		/*System.out.println( response);
		System.out.println( myguess);*/

	while( n <8)
		{
			if ( response < myguess)
			{
				System.out.println ( " Sorry, you are too low.");
				System.out.print (" Guess # " + n++ + ":");
				response= myinput.nextInt();
			}

			else if (response> myguess)
			{
				System.out.println( " Sorry, that guess is too high ") ; 
				System.out.print (" Guess # " + n++ + ":");
				response= myinput.nextInt();
				
			}
	
			else if (response == myguess)
			{
			System.out.println ( " You guessed it! You are a shark oo");

			return;
			
			}
		
		}
System.out.println (" Sorry, you didn't guess it in 7 tries. You lose.\n My guess was "+ myguess );

	}
}
