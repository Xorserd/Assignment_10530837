import java.lang.*;
import java.util.Scanner;

class RightTriangleChecker
{
	public static void main (String []args)
	{

		Scanner myinput = new Scanner(System.in);
		System.out.println (" Enter three integers: ");
		
		int side1, side2,side3;

		System.out.print (" Side 1: ");
		side1 = myinput.nextInt();

		System.out.print (" Side 2: ");
		side2 = myinput.nextInt();

		while ( side1>side2 )
			{
				System.out.println(side2 +" is smaller than " + side1+ " try again:");
				System.out.print (" Side 2: ");
				side2 = myinput.nextInt();
			}

		System.out.print (" Side 3: ");
		side3 = myinput.nextInt();

			while ( side2>side3)
			{
				System.out.println ( side3 + " is smaller than " + side2 + ". Try again");
				System.out.print (" Side 3: ");
				side3 = myinput.nextInt();
			}

			while ( side1>side3)
			{
	
				System.out.println ( side3 + " is smaller than " + side1 + ". Try again");
				System.out.print (" Side 3: ");
				side3 = myinput.nextInt();
			}
		
	System.out.println (" Your three sides are " + side1 +"," +side2 +","+ side3 );
	
 
		if (side3 == Math.sqrt( (side1*side1)+ (side2*side2))) 
			System.out.println( " These sides *do* make a right triangle " );

		else
			System.out.println (" NO! These sides do not make a right triangle ");

	return;


	}
}
