import java.util.Scanner;
import java.util.Random;

class ThreeCardMonte
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
	
		Random myRand = new Random();
		int myGuess = 1 + myRand.nextInt(3);

		String response = " ";
		

		System.out.print (" You slide up to Fast Eddie's card table and plop down your cash. He glances at you out of the corner of his eye and starts shuffling. He lays down three cards. \n \n Which one is the ace? ");

		int myinput= input.nextInt();
	
		if (myinput !=myGuess)
		{
			System.out.println ( " Ha, Fast Eddie wins again! The ace was card number " + myGuess);
			
		if ( myGuess == 1)
			{
			response = " \t \t AA  ##  ## \n \t \t AA  ##  ## \n \t \t 1   2   3";
			}
		
		else if ( myGuess == 2)
			{
			response = " \t \t ##  AA  ## \n \t \t ##  AA  ## \n \t \t 1   2   3";
			}
		
		else if ( myGuess == 3)
			{
			response = " \t \t ##  ##  AA \n \t \t ##  ##  AA \n \t \t 1   2   3";
			}

		System.out.println ( response);


}

		else if ( myinput == myGuess)
		{
			if ( myGuess == 1)
			{
			response = " \t \t AA  ##  ## \n \t \t AA  ##  ## \n \t \t 1   2   3";
			}
		
		else if ( myGuess == 2)
			{
			response = " \t \t ##  AA  ## \n \t \t ##  AA  ## \n \t \t 1   2   3";
			}
		
		else if ( myGuess == 3)
			{
			response = " \t \t ##  ##  AA \n \t \t ##  ##  AA \n \t \t 1   2   3";
			}

		System.out.println( " You nailed it! Fast Eddie relunctatly hands over your winings, scowling."+ " \n" + response );

		}
}
}
