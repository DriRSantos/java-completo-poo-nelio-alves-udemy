package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		DadosPessoas[] vect = new DadosPessoas[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa:  ", i+1);
			sc.nextLine();
			double height = sc.nextDouble();
			char genre = sc.next().charAt(0); //1º caractere do string
			vect[i] = new DadosPessoas(height, genre);
		}
		
		double menorAlt = vect[0].getHeight();
		double maiorAlt = vect[0].getHeight();
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getHeight() > maiorAlt) {
				maiorAlt = vect[i].getHeight();
			}
			else if (vect[i].getHeight() < menorAlt) {
				menorAlt = vect[i].getHeight();
			}			
		}
		
		System.out.println();
		System.out.printf("Menor altura = %.2f%n", menorAlt);
		System.out.printf("Maior altura = %.2f%n", maiorAlt);
		
		double somaAlt = 0;
		int mulheres = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getGenre() == 'F') {
				somaAlt += vect[i].getHeight();
				mulheres++;
			}
		}
		double avg = somaAlt / mulheres;
		
		System.out.printf("Media das alturas das mulhers = %.2f%n", avg);
		
		int homens = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getGenre() == 'M') {
				homens++;
			}
		}

		System.out.print("Numero de homens" + homens); 
		
		sc.close();
	}
}
