import java.util.Scanner;

class HowOldAreYou
{
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		

		String name;
		int age;
				
	
		System.out.print(" Hey, What's your name?");
		name = input.next();

		System.out.print (" ok," + name + ", how old are you?");
		age = input.nextInt();
	
		if (age<16)
		{
			System.out.println ( " you can't drive," + name);
		}
		
		if ( age <18) 
		{
			System.out.println (" you can't vote," + name);
		}
		
		if ( age <35) 
		{
			System.out.println (" you can't rent a car," + name);
		}

		else if( age>25) 
		{
			System.out.println (" you can do anything that's legal," + name);
		}
	}
}
