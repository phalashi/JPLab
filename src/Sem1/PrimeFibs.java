package Sem1;

import java.util.Scanner;

/* Program to print all prime numbers between 1 to n, only if it is part of the Fibonacci series. For
example: n value is 10, 1 to 10 prime numbers are : 2, 3, 5, 7. Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21.. output is: 2,3,5 */

public class PrimeFibs {

	public static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void primeFibs(int n) {
		int a = 0, b = 1;
		while (a <= n) {
			if (isPrime(a))
				System.out.print(a + " ");
			int temp = b;
			b += a;
			a = temp;
		}
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter n: ");
		Scanner console = new Scanner(System.in);
		n = console.nextInt();
		primeFibs(n);

	}

}
