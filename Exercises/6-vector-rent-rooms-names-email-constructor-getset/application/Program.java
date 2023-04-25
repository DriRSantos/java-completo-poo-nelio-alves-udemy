package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vect = new Pensionato[10]; //para criar apenas 10 quartos
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) { //começa com 1 pois não vai ter haver com o vetor
			System.out.println();
			System.out.println("Rent #" + i + ":"); //mas sim com o aluguel
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();			
		    System.out.print("Room: ");
		    int room = sc.nextInt(); //ao informar o quarto, está informando posicao no vetor
			vect[room] = new Pensionato(name, email); //instanciando o objeto e atribuindo a referencia dele para o vetor room 
		}
						
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] != null) {					
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
