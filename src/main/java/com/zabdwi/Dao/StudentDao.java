package com.zabdwi.Dao;

import java.util.List;

import com.zabdwi.api.MarksStudent;
import com.zabdwi.api.Student;


public interface StudentDao {
	public List<Student> loadStudents();
	
	void save(Student student);
	
	void saveMark(MarksStudent student);
	
	Student getStudent(int id); 
	
	List<MarksStudent> getMarkStudent(int id); 

	boolean delete(int id);

	void update(Student student);
	
	List<Student> search(String name);
}
