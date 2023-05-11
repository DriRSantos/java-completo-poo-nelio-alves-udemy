package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
//		used to populate database
//		Person person1 = new Person(null, "Dri Neves", "drinev@email.com");
//		Person person2 = new Person(null, "Maria", "maria@email.com");
//		Person person3 = new Person(null, "Noah", "noah@email.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();		
		
//		used to populate database
//		em.getTransaction().begin();
//		em.persist(person1);
//		em.persist(person2);
//		em.persist(person3);
//		em.getTransaction().commit();
//		System.out.println("Ready!");
		
		// search database, convert table data to object and instantiate object
		Person p = em.find(Person.class, 2);
		System.out.println(p);
		
		// error removing datached instance
//		Person p1 = new Person(3, "Noah", "noah@email.com");
//		em.remove(p1);
		
		// to delete you have to merge the detached instance first and create transaction 
		em.getTransaction().begin();
		Person p1 = em.find(Person.class, 3);
		em.remove(p1);
		em.getTransaction().commit();
		
		System.out.println("Ready!");
		em.close();
		emf.close();
	}
}
