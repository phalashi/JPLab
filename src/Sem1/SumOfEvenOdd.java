package Sem1;

/* Java SE code that reads a set of integers, and then prints the sum of the even and odd integers
separately */

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenOdd {

	public static void calcEvenOddSum(ArrayList<Integer> arr) {
		int odd = 0, even = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (i % 2 == 0)
				odd += arr.get(i);
			else
				even += arr.get(i);
		}
		System.out.println("Odd Sum: " + odd + "\nEven Sum: " + even);
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the numbers separated by a space: ");
		String[] line = console.nextLine().split(" ");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < line.length; i++)
			arr.add(Integer.parseInt(line[i]));
		calcEvenOddSum(arr);

	}

}
