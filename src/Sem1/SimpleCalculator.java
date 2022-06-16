package Sem1;

import java.util.Scanner;

/* JavaSE application to make a Simple Calculator using switch...case
​​should be able to add, subtract, multiply and divide two numbers. Scan the two numbers and operator using Scanner
class. */

public class SimpleCalculator {

	public static double calculate(double op1, double op2, String op) {
		switch (op) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		default:
			return Double.POSITIVE_INFINITY;
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the 1st operand: ");
		double op1 = console.nextDouble();
		System.out.print("Enter the 2nd operand: ");
		double op2 = console.nextDouble();
		System.out.print("Enter the operator (+, -, *, /): ");
		String op = console.next();

		double result = calculate(op1, op2, op);
		if (result != Double.POSITIVE_INFINITY)
			System.out.printf("%f %s %f = %f\n", op1, op, op2, result);
		else
			System.out.println("Invalid Operation.\n");

	}

}
