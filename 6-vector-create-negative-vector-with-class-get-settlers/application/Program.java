package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Negativos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números vai digitar");
		int n = sc.nextInt();
		
		Negativos[] vect = new Negativos[n]; 
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			int numbers = sc.nextInt();
			vect[i] = new Negativos(numbers);
		}
		
		System.out.println("Numeros negativos");
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getNumbers() < 0) {
				System.out.printf("%d%n", vect[i].getNumbers());
			}
		}
		
		sc.close();
	}

}
