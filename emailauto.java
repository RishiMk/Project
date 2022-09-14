package EmailApp;

import java.security.SecureRandom;
import java.util.Scanner;

public class emailauto 
{
	String FirstName;
	String LastName;
	String Department;
	int mailCount;
	
	Scanner sc = new Scanner(System.in);
	
	emailauto(String first, String last) 
	{
		FirstName = first;
		LastName = last;
	}
	
	String password()
	{	
		int len = 8;
		final String Letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<len; i++)
		{
			int randomIndex = random.nextInt(Letter.length());
			sb.append(Letter.charAt(randomIndex));
			
		}
		System.out.println(sb);
		return sb.toString();
	}
	
	void generateEmail()
	{
		System.out.println("Enter your first name:");
		FirstName = sc.next();
		if (FirstName.length() == 0)
		{
			System.out.println("Please enter your firstname.!");
		}
		System.out.println("Enter your last name:");
		LastName = sc.next();
		if (LastName == "")
		{
			System.out.println("Please enter your lastname.!");
		}
		System.out.println("Enter your Department name:");
		Department = sc.next();
		if (Department.length() == 0)
		{
			System.out.println("Please enter your Department.!");
		}
		
		System.out.println(FirstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + Department.toLowerCase() + ".ac.in");
		System.out.print("Your Password is: ");
		password();
	}
	
}
