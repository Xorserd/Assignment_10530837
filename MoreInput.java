import java.util.Scanner;

class MoreInput
	{
		public static void main (String args [])
		{
			Scanner input = new Scanner(System.in);
	
			String fname;
			String lname;
			String id;
			String loginName;
			double gpa;	
			int grade;
			
			
			System.out.println ( " Please enter the following information so i can sell it for a profit");
			System.out.print (" First name :");
			fname = input.next();			
			
			System.out.print (" Last name :");
			lname = input.next();	
			
			System.out.print (" Grade (9-12) :");
			grade = input.nextInt();			
			
			System.out.print (" Student ID:");
			id = input.next();	
		
			System.out.print (" Login Name :");
			loginName = input.next();	

			System.out.print (" GPA ( 0.0-4.0):");
			gpa = input.nextDouble();	

			System.out.println ( " Your information: ");
			System.out.println (" \tLogin Name 	: " + loginName);
			System.out.println (" \tID		: " + id);
			System.out.println (" \tName		: " + lname +"," + fname);			
			System.out.println (" \tGPA		: " + gpa);
			System.out.println (" \tGrade		: " + grade);			
		

		}
	}
