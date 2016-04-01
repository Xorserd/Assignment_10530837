import java.util.Scanner;

class CollatzSequence
{
	public static void main (String args[])
	{
		Scanner myinput = new Scanner (System.in);

		System.out.print (" Starting number: ");
		int response = myinput.nextInt();

		do {
			while (response % 2==0){
				response = response/2;
						
						System.out.print ( response + " \t");
						}
			while (response % 2==1){
				response = (response*3)+1;
				System.out.print ( response + " \t");}
			while ( response % 2 ==0){
					response = response/2;
				System.out.print ( response + " \t");
				}							
									
			if( response==1)
			break;

			/*while (response % 2!=0){
				answer = response*3+1;
				while  (answer % 2==0){
					answer = answer/2;}
						while( answer==1){
							return;}}

		System.out.println ( answer);
*/
			}while (true);

		}
}
