package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Heights;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Heights[] vetnome = new Heights[n];
		Heights[] vetidade = new Heights[n];
		Heights[] vetalt = new Heights[n];
		
		for (int i=0; i<vetnome.length; i++) {
			System.out.printf("Dados da %da pessoa %n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			vetnome[i] = new Heights(nome);
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vetidade[i] = new Heights(idade);
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetalt[i] = new Heights(altura);
		}
		
		double sumage = 0.0;
		for (int i=0; i<vetalt.length; i++) {
			sumage += vetalt[i].getAltura();
		}

		double avg = sumage / vetalt.length;				
				
		int contador = 0;
		for (int i=0; i<vetidade.length; i++) {
			if (vetidade[i].getIdade() < 16) {
				contador++;
			}
		}
		double porcent = contador * 100 / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f", avg);
		System.out.println();
		System.out.printf("Pessoas com menos 16 anos: %.1f%%", porcent);
		
		System.out.println();	
		for (int i=0; i<vetalt.length; i++) {
			if (vetidade[i].getIdade() < 16) {
				System.out.println(vetnome[i].getNome());
			}
		}
		
		sc.close();
	}
}
