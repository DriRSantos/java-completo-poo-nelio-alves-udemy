package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person person1 = new Person(1, "Dri Neves", "drinev@email.com");
		Person person2 = new Person(1, "Maria", "maria@email.com");
		Person person3 = new Person(1, "Noah", "noah@email.com");
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
