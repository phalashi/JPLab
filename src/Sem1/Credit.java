//package Sem1;

import java.util.Scanner;

/* 14: Create and Raise the exception CreditsNotSuffiecientException if credits are less than 50 with
different caller methods. and handle them.. */

class CreditsNotSufficientException extends Exception {
	public CreditsNotSufficientException() {
		System.out.println("Error: Credits inadequate.");
	}
}

 public class Credit {
	
	public static void checkCredits(int credits) throws CreditsNotSufficientException{

		if (credits < 50)
			throw new CreditsNotSufficientException();
		else
			System.out.println("Credits sufficient. Promotion successful.");
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the credits gained: ");
		int credits = console.nextInt();
		try
		{
		    checkCredits(credits);
		}
		catch (CreditsNotSufficientException ex)
		{
		    System.out.println(ex);
		}
		
	}

}
