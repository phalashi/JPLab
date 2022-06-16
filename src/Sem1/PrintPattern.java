package Sem1;

import java.util.Scanner;

/* Print the following pattern
1
212
32123
4321234
543212345 */

public class PrintPattern {
	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = console.nextInt();
		printPattern(n);

	}

}
