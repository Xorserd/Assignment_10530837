import java.util.Random;

class DiceDoubles
{
	public static void main (String args[])
	{
		Random r = new Random();

		System.out.println (" HERE COMES THE DICE!");
	
	
		int roll1 = 1 + r.nextInt(6);
		int roll2 = 1 + r.nextInt(6);
	while (roll1 != roll2){
		System.out.println (" Roll #1: " + roll1);
		System.out.println ( " Roll #2: " + roll2);
		
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);

		int total = roll1+roll2;
		System.out.print (" \nThe Total is " + total + " !\n");
	} 
	
		System.out.println ("  Roll #1: " + roll1);
		System.out.println ( " Roll #2: " + roll2);

	}
}
