import java.util.Scanner;


class AddingValuesInALoop
{
	public static void main (String [] args)
	{

		Scanner myinput = new Scanner(System.in);
			
		System.out.print (" I will add up the numbers you give me\n Number: ");

		int response = myinput.nextInt();
		int total = 0;
		total = total + response;
	
		while (response !=0)
			{
			
			System.out.print (" The total so far is " + total+ " \n Number: ");
			response = myinput.nextInt();
			total = total + response;
			
			} 

		
			total = total + response;
			System.out.println ( " \n The total is " + total);
			

	}
}
