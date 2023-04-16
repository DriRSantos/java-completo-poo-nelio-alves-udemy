package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		MaisVelho[] vect = new MaisVelho[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa:  ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			vect[i] = new MaisVelho(name, age);
		}
		
		int maiorIdade = vect[0].getAge();
		String pessoaVelha = vect[0].getName();
		System.out.println();
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() > maiorIdade){ 
				maiorIdade = vect[i].getAge();
				pessoaVelha = vect[i].getName();
		    }
		}
		
			System.out.println("PESSOA MAIS VELHA: " + pessoaVelha);	
		
		sc.close();
	}

}
