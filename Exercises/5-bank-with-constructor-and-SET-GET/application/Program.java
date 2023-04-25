package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Conta conta;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); //para consumir a quebra de linha do anterior
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit); //declarou a variavel conta FORA la em cima	
		}											//para poder usar fora do if	
		else {
			conta = new Conta(number, holder); //se a pessoa não depositar
		}										//instancia com construtor de 2 argumentos
		
				
		System.out.println();
		System.out.println("Account data: "); 
		System.out.println(conta);  //tem que ter o tooString na classe Conta
									//para imprimir os resultados na tela
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue); //essa operaçao realiza DEPOSITO
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue); //essa operaçao realiza SAQUE
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();

	}

}
