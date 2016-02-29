import java.util.Scanner;

class ForgetfulMachines
	{
		public static void main (String []args)
			{
				Scanner var = new Scanner (System.in);
				
				System.out.println( " Give me a work!");
				var.next();
			
				System.out.println (" Give me a second word!");
				var.next();

				System.out.println (" Great, now your favourite number?");
				var.nextInt();
		
				System.out.println (" And your second-favourite number...");
				var.nextInt();

			}
	}
