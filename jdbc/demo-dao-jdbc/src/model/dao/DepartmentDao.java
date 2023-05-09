package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	// insert obj on database
	void insert(Department obj);
	
	// update obj on database
	void update(Department obj);
	
	// delete obj by Id on database
	void deleteById(Integer id);
	
	// find on database the obj by id
	Department findById(Integer id);
	
	// find all departments (list)
	List<Department> findAll();
}
