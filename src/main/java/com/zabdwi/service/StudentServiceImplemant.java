package com.zabdwi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zabdwi.Dao.StudentDao;
import com.zabdwi.api.MarksStudent;
import com.zabdwi.api.Student;

@Service
public class StudentServiceImplemant implements StudentService {
	@Autowired
	StudentDao studentDao;

	@Override
	public List<Student> loadStudents() {
		List<Student> loadStudents = studentDao.loadStudents();
		return loadStudents;
	}

	@Override
	public void save(Student student) {
		studentDao.save(student);
	}

	@Override
	public Student getStudent(int id) {
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public void update(Student student) {
		
		studentDao.update(student);
	}

	@Override
	public boolean delete(int id) {
		 
		return studentDao.delete(id);
	}

	@Override
	public List<Student> search(String name) {
		List<Student> search = studentDao.search(name);
		
		return search;
		
		
	}

	@Override
	public void saveMark(MarksStudent student) {
		studentDao.saveMark(student);
		
	}

	@Override
	public List<MarksStudent> getMarkStudent(int id) {
		return studentDao.getMarkStudent(id);
		
	}

}
