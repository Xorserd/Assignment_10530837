import java.util.Scanner;

class SpaceBoxing
{
	public static void main (String []args)
	{
		Scanner input = new Scanner (System.in);
		
		double weight;
		int planet;
		double result;
		
		System.out.print (" Please enter your current earth weight: ");
		weight = input.nextDouble();

		System.out.println (" I have information for the following planets:");
	
		System.out.println (" \t1. Venus \t 2. Mars \t 3. Jupiter \n \t4. Saturn \t 5. Uranus \t 6. Neptune");

		System.out.print (" Which Planet are you visiting?");
		planet = input.nextInt();
		if ( planet ==1)
		{
			result = 0.78*weight;
			System.out.println (" Your weight would be " + result+ " pounds on that planet");
		}
		else if (planet ==2)
		{
			result = 0.39*weight;
			System.out.println (" Your weight would be " + result + " pounds on that planet");
		}
		else if (planet ==3)
		{
			result = 2.65*weight;
			System.out.println (" Your weight would be " + result + " pounds on that planet");
		}
		else if (planet ==4)
		{
			result = 1.17*weight;
			System.out.println (" Your weight would be " + result + " pounds on that planet");
		}
		else if (planet ==5)
		{
			result = 1.05*weight;
			System.out.println (" Your weight would be " + result + " pounds on that planet");
		}
		else if (planet ==6)
		{
			result = 1.23*weight;
			System.out.println (" Your weight would be " + result + " pounds on that planet");
		}
		

	}
}
