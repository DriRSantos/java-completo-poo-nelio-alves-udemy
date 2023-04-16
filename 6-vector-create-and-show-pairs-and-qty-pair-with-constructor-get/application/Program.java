package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NumerosPares;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		NumerosPares[] vect = new NumerosPares[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			int numbers = sc.nextInt();
			vect[i] = new NumerosPares(numbers);
		}
		
		System.out.println();
		int qtdPar = 0;
		System.out.println("NUMEROS PARES: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers() % 2 == 0) {
				System.out.print(vect[i].getNumbers() + " ");
				qtdPar++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares = " + qtdPar);		
		
		sc.close();
	}

}
