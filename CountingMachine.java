import java.util.Scanner;

class CountingMachine
{
	public static void main (String []args)
	{
		Scanner myinput = new Scanner(System.in);

		System.out.print( " Count to: ");
		int response = myinput.nextInt();

		for (int i= 0; i<=response; i++)
	 	{
			System.out.print( i + " ");
		}
	}
}
