import java.util.Scanner;

class name_age
	{
		public static void main (String args [])
			{
				Scanner var = new Scanner (System.in);
				
				String name;
				int age;
				double salary;

				System.out.println (" Hello. What is your name?");
				 name= var.next();
				
				System.out.println (" Hi, " + name + "!  How old are you?");
				age = var.nextInt();

				System.out.println (" So you're "+ age+ " , eh? That's not old at all!" );
				

				System.out.println (" How much do you make," + name +"? ");
				salary = var.nextDouble();
				
				System.out.println (" I hope that's per hour and not per year! LOL!");
						
		}
	}	
