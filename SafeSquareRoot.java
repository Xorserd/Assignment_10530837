import java.util.Scanner;
import java.lang.Math;

class SafeSquareRoot
{
	public static void main (String []args)
	{
			
		Scanner myinput = new Scanner (System.in);	

		System.out.print (" SQUARE ROOT! \n Enter a number: ");
			double response = myinput.nextInt();
		
		do {	if( response>0) {
			double sqroot =  Math.sqrt(response);
			System.out.println (" The square root of " + response + " is " + sqroot);
			break;
			}
			
			else 
		System.out.print (" You can't take the square root of a negative number, silly. \n Try again: ");
			response = myinput.nextInt();
			}
			while(true);


		
			
		


	}
}
