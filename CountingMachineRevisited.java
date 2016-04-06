import java.util.Scanner;

class CountingMachineRevisited
{
	public static void main (String args[])
	{
		Scanner myinput = new Scanner (System.in);

		System.out.print( " Count from: ");
		int response1 = myinput.nextInt();

		System.out.print( " Count to  : ");
		int response2 = myinput.nextInt();
		
		System.out.print( " Count by  : ");
		int response3 = myinput.nextInt();

		for (int i= response1; i<=response2; i++)
	 	{
			i++;
			System.out.print( i + " ");
		}
	
	}
}	
