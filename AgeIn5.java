import java.util.Scanner;

class AgeIn5 
	{
		public static void main (String [] args)
			{
				Scanner input = new Scanner(System.in);
									
				String name;
				int age;

				
	
				System.out.print (" Hello. What is your name? ");
				name = input.next();
			
				System.out.println ("Hi, "+ name + "! How old are you?");
				age = input.nextInt ();

				int oldage = age -5;
				int newage = age + 5;

				System.out.println (" Did you know that in five years, you will be " + newage + " years old");
				System.out.println ( " And five years ago, you were " + oldage +" ! Imagine that!");
			}
}
