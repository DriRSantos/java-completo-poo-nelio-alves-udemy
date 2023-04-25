package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Vetsoma;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Vetsoma[] vect = new Vetsoma[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double numbers = sc.nextDouble();
			vect[i] = new Vetsoma(numbers);
		}
		
		System.out.println();
		System.out.printf("VALORES ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i].getNumbers() + " ");
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getNumbers();  
		}
		
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.printf("SOMA %.2f%n", sum);
		System.out.printf("MEDIA %.2f%n", avg);		
		
		sc.close();
	}

}
