package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoMedia;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		AbaixoMedia[] vect = new AbaixoMedia[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double numbers = sc.nextDouble();
			vect[i] = new AbaixoMedia(numbers);
		}
		
		System.out.println();
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getNumbers();
		}
		
		double avg = sum / n;
		
		System.out.printf("MEDIA DO VETOR %.3f%n", avg);
		System.out.println("Elementos abaixo da média: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers() < avg) {
				System.out.println(vect[i].getNumbers());
			}
		}
		
						
		
		sc.close();
	}

}
