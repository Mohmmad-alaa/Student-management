package com.zabdwi.service;

import java.util.List;

import com.zabdwi.api.MarksStudent;
import com.zabdwi.api.Student;

public interface StudentService {

	public List<Student> loadStudents();

	void save(Student student);

	Student getStudent(int id);

	void update(Student student);
	
	boolean delete(int id);

	public List<Student> search(String name);
	
	void saveMark(MarksStudent student);
	
	List<MarksStudent> getMarkStudent(int id); 
}
