import java.util.Scanner;

class DumbCalculator
	{
		public static void main (String args [])
			{

				double num1,num2, num3,result;
				Scanner input = new Scanner (System.in);
				
				System.out.print (" What is your first number?");
				num1 = input.nextDouble ();
			
				System.out.print (" What is your second number?");
				num2 = input.nextDouble ();

				System.out.print (" What is your third number?");
				num3 = input.nextDouble ();

				result = (num1+num2+num3)/2;

				System.out.print(" ( " + num1);
				System.out.print(" + " + num2);
				System.out.print(" + " + num3);

				System.out.print(") /2 is ... " + result);
			}
	}
