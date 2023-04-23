package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withDraw = sc.nextDouble();
		
		Account ac = new Account(number, holder, balance, withDraw);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		String error = ac.validateWithdraw(amount);
		if (error != null) {
			System.out.println(error);
		}
		else {
			ac.withdraw(amount);
		   System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));
		}
		
		sc.close();
	}
}
