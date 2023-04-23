package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.println("Array order? ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
 			
		System.out.println("Digite os numeros inteiros: ");
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + "  ");
			}
		
		int qtdnegativos = 0;
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length;j++) {
				if (matrix[i][j] < 0) {
					qtdnegativos++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + qtdnegativos);
		
		sc.close();
	}
}
