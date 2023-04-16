package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

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
			
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
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
		
		Employee emp = employees.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble(); 
			emp.increaseSalary(percent);
		}             
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e: employees) {
			System.out.println(e);
		}
		
		sc.close();
	}
	//funcao auxiliar para procurar elemento na lista
		public static boolean hasId(List<Employee> list, int id) {
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null; //vai retornar verdadeior se o id existir
	}
	
}
