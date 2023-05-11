package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: department insert =====");
		Department newDep = new Department(null, "Cars");
		departmentDao.insert(newDep);
		System.out.println("New Department created. Number: " + newDep.getId());
		
		System.out.println("\n=== TEST 4: department update =====");
		department = departmentDao.findById(9);
		department.setName("Games");
		departmentDao.update(department);
		System.out.println("Department " + department.getId() + " updated to " + department.getName());
		
		// another test to type department id and name
//		System.out.print("Which department you like to update? Type id: ");
//		int id = sc.nextInt();
//		Department depart2 = departmentDao.findById(id);
//		System.out.print("Which name you like to insert in the table? ");
//		sc.nextLine();
//		depart2.setName(sc.nextLine());
//		departmentDao.update(depart2);		
		
		System.out.println("\n=== TEST 4: department delete =====");
		System.out.print("Which department you like to delete? Type id: ");
		int id = sc.nextInt();
		Department dep3 = departmentDao.findById(id);
		departmentDao.deleteById(id);
		
		if (dep3 == null) {
			System.out.println("Department doesn't exist ");
		}
		else {
			System.out.println("Department " + dep3.getName() + " deleted!");
		}
		sc.close();
	}

}
