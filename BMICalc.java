import java.util.Scanner;

class BMICalc 
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double height, weight, result;
		
		System.out.print (" Your height in m: ");
		height = input.nextDouble();
	
		System.out.print (" Your weight in kg: ");
		weight = input.nextDouble();

		result = weight/(height*height);

		System.out.println (" Your BMI is " + result);
	
	
	}
}
