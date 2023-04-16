package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorPosicao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		MaiorPosicao[] vetor = new MaiorPosicao[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			double numbers = sc.nextDouble();
			vetor[i] = new MaiorPosicao(numbers);
		}
		
		double maior = 0.0;
		int posMaior = 0;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i].getNumbers() > maior) {
				maior = vetor[i].getNumbers();
				posMaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posMaior);
		
		sc.close();
	}

}
