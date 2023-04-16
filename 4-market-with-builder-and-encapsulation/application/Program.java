package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();//construtor padrão sendo chamado
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();  //variaveis temporarias para entrarem no construtor
		Product product = new Product(name, price);	//apagou quantity aqui e no Product			
													//pois quantidade começa com zero, deixando padrao é zero
		
		product.setName("Computer");//se quiser alterar o nome do produto, que o nome seja acessado
									//não vai mais usar product.name = "Computer" > tem que usar o setName
		System.out.println("Updated name: " + product.getName()); //para imprimir o nome 		
											//atualizado, precisa usar o get, para permitir que o novo nome seja obtido				
		
		product.setPrice(1200.00); //para atualizar o preço tem que usar o SET
		System.out.println("Updated price: " + product.getPrice()); // e para acessar o preco tem que usar GET
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); //isso faz a atualizacao da quantidade //
									// dentro do objeto quantity //
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
