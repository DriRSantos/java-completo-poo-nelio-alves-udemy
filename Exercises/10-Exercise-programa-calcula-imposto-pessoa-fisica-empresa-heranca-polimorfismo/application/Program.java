package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Tax payer # " + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.println("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
     		} 
	    	 else {
		 		System.out.println("Number of employees: ");
		 		Integer numberOfEmployees = sc.nextInt();
		 		
		 		list.add(new Company(name, anualIncome, numberOfEmployees));
		    }
	   }
		
	   System.out.println();
	   System.out.println("TAXES PAID:");
	   for (TaxPayer taxpayer : list) {
		   System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.taxes()));
	   }
	  
	   System.out.println();
	   double sum = 0.0;
	   for (TaxPayer taxpayer : list) {
		   		sum += taxpayer.taxes();
	   }
	   System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
	 sc.close();
	} 
}
