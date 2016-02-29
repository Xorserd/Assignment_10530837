import java.util.Scanner;

class HowOldAreYou2
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
		
		else if ( age <18) 
		{
			System.out.println (" you can drive but not vote," + name);
		}
		
		else if ( age <35) 
		{
			System.out.println (" you can vote but not rent a car," + name);
		}

		else  if( age>25) 
		{
			System.out.println (" you can do pretty much anything," + name);
		}
	}
}
