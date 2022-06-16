package Sem1;

import java.util.Scanner;

public class MultiplyMatrices {

	static Scanner console = new Scanner(System.in);

	static int[][] readMatrix(int rows, int cols) {
		int[][] mat = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("Enter element %d %d :", i + 1, j + 1);
				mat[i][j] = console.nextInt();
			}
		}
		return mat;

	}

	static void displayMatrix(int[][] mat, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	static int[][] multiplyMatrix(int[][] mat1, int rows1, int cols1, int[][] mat2, int rows2, int cols2) {
		int[][] res = new int[rows1][cols2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				res[i][j] = 0;
				for (int k = 0; k < cols1; k++) {
					res[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int row1, col1, row2, col2;
		System.out.println("Enter the number of rows of matrix 1: ");
		row1 = console.nextInt();
		System.out.println("Enter the number of columns of matrix 1: ");
		col1 = console.nextInt();
		System.out.println("Enter the number of rows of matrix 2: ");
		row2 = console.nextInt();
		System.out.println("Enter the number of columns of matrix 1: ");
		col2 = console.nextInt();
		if (col1 != row2) {
			System.out.println("Invalid Matrix dimensions! ");
			return;
		}

		System.out.println("Enter the entries of matrix 1: ");
		int[][] mat1 = readMatrix(row1, col1);
		System.out.println("Matrix 1 is: ");
		displayMatrix(mat1, row1, col1);
		System.out.println("Enter the entries of matrix 2: ");
		int[][] mat2 = readMatrix(row2, col2);
		System.out.println("Matrix 2 is: ");
		displayMatrix(mat2, row2, col2);
		int[][] res = multiplyMatrix(mat1, row1, col1, mat2, row2, col2);
		System.out.println("The result is: ");
		displayMatrix(res, row1, col2);

	}

}
