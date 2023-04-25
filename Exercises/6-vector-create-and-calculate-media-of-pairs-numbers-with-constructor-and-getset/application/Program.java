package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaPares;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		MediaPares[] vect = new MediaPares[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			int numbers = sc.nextInt();
			vect[i] = new MediaPares(numbers);
		}
		
		System.out.println();
		int sum = 0;
		int pares = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers() % 2 == 0){ 
				sum += vect[i].getNumbers();
				pares++;
		    }
		}
		
		if (pares == 0) {
	    	System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double avg = (double) sum / pares;
			
			System.out.printf("MEDIA DOS PARES %.1f", avg);		
		}
		
		sc.close();
	}

}
