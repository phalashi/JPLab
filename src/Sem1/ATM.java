import java.util.Scanner;

/* Assignment 15: Design a an application called ATM PIN Validator
which will read the acc holder name and pin no
if pin no is incorrect while trying in 3 times
PinMisMatchException object will throw an exception called Sorry..Your Account Has been Locked*/

class PinMisMatchException extends Exception
{
	
	public PinMisMatchException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class ATM {
	static String fname;
	static String lname;
	static int pin;
	static Scanner console = new Scanner(System.in);
	public static void validatePIN() throws PinMisMatchException
	{
		int tries = 0;
		while (true)
		{
			System.out.println("Trial " + (tries + 1) + ": ");
			int attempt = console.nextInt();
			if (attempt == pin)
			{
				System.out.println("PIN matched!");
				return;
			}
			tries++;
			if (tries == 3)
				throw new PinMisMatchException("Sorry..Your Account Has been Locked");
			
			
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter first name, last name, and PIN: ");
		fname = console.next();
		lname = console.next();
		pin = console.nextInt();
		try
		{
			validatePIN();
		}
		catch(PinMisMatchException e)
		{
			System.out.println(e);
		}
	}

}
