package Sem1;

import java.util.Arrays;
import java.util.Scanner;

/* Given a string and it contains the digits as well as non-digits. We have to find the largest even number
from available digits after removing the duplicates. If not possible, print -1. (For a given string ad%#2373#@ the
output is  732) */

public class LargestEvenNoAfterRemovingDuplicates {

	public static String calcNo(String input) {
		int[] ans = new int[input.length()];
		String res = "";
		int pos = 0;
		boolean minEvenFound = false;
		int minEven = Integer.MAX_VALUE;
		for (int i = 0; i < input.length(); i++) {
			char elem = input.charAt(i);
			if ('0' <= elem && elem <= '9') {
				ans[pos] = elem - '0';
				if (ans[pos] % 2 == 0) {
					minEvenFound = true;
					minEven = Math.min(ans[pos], minEven);
				}
			} else
				ans[pos] = -1;
			pos++;
		}
		Arrays.sort(ans);
		if (ans.length == 0 || !minEvenFound)
			return "-1";
		res += minEven;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] != -1 && !res.contains(Integer.toString(ans[i])))
				res = ans[i] + res;
		}

		return res;

	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = console.next();
		System.out.println("Result: " + calcNo(input));

	}

}
