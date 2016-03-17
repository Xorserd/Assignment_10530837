import java.util.Random;
import java.util.Scanner;

class FortuneCookie
{
	public static void main  (String []args)
	{
		Scanner myinput=new Scanner(System.in);

		Random r = new Random ();
		int choice = 1+r.nextInt (54);
		String wish =" ";
		
		System.out.print(" Enter a number between 1 and 6 for your fortune cookie: " );
		int response = myinput.nextInt();

		if ( response == 1)
		{
			wish = " You will find hapiness with a new love";
		}
		
		else if ( response == 2)
		{
			wish = " You will get a new house";
		}
		
		else if ( response == 3)
		{
			wish = " Your first child would be a twin";
		}
		else if ( response == 4)
		{
			wish = " Congratulation, new managing director in town ";
		}
		
		else if ( response == 5)
		{
			wish = " here are your new car keys";
		}

		else if ( response == 6)
		{
			wish = " wow, your wages is the highest ";
		}


		System.out.println ( " Fortune cookie says: " + wish);
		
		System.out.println ( " Allow me to add something else" );

		System.out.println ( choice + " - " + choice + " - "+ choice + " - "+ choice + " - "+ choice + " - "+ choice + " - ");
	
	}	
}

