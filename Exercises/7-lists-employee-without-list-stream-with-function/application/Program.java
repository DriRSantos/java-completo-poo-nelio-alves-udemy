package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) { 
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary); // se preferir pode tirar 
			employees.add(emp);  //e deixar employees.add(new Employee(id, name, salary));
		}
						
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj: employees) {
			System.out.println(obj);
		}
		
		//update salary of one person
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
		Integer pos = position(employees,idsalary);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble(); 
			employees.get(pos).increaseSalary(percent); //vai acessar a lista o funcionario que esta na posicao pos
		}             //get(pos) acessa o funcionario que está na posicao pos e a partir deste funcionario vou chamar o aumento de salario                      
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp: employees) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	//funcao auxiliar para procurar elemento na lista e retornar a posicao 
	public static Integer position(List<Employee> list,int id) { 
		for (int i=0; i<list.size(); i++) { 
			if(list.get(i).getId() == id) {
				 return i;
			}				
		}                 
		return null;
	}
	
}
