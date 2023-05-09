package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller sel = new Seller(1, "Adriana", "dri@email.com", new Date(), 2500.0, obj);
		System.out.println(sel);
	};

}
