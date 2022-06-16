package Sem1;

import java.util.Scanner;

public class PalindromeCheck {

	static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = console.next();
		if (isPalindrome(str))
			System.out.println(str + " is a palindrome.");

		else
			System.out.println(str + " is not a palindrome.");

	}

}
