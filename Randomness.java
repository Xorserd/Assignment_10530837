import java.util.Random;

public class Randomness
{
	public static void main (String []args)
	{

	Random r= new Random();

	int x= 1 + r.nextInt(10);

	System.out.println (" My random number is " + x);

	System.out.println (" Here are some numbers from 1 to 5!");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ( 1 + r.nextInt (5) + " ");
	System.out.println ();

	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ( 1 + r.nextInt (100) + " \t");
	System.out.println ();

	int num1 = 1+ r.nextInt (10);
	int num2 = 1+ r.nextInt (10); 

	if (num1 == num2)
	{
		System.out.print (" The random numbers were the same! Wierd.");
	}	
	
	if ( num1 != num2)
	
	{
	System.out.print (" The random numbers were different! Not too surprising, actually.");
	}

}

}

	
