package com.zabdwi.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zabdwi.api.MarksStudent;
import com.zabdwi.api.Student;
import com.zabdwi.rowMapper.MarkStudentRowMapper;
import com.zabdwi.rowMapper.StudentRowMapper;

@Repository
public class StudentImplemant implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Student> loadStudents() {

		String Sql = "SELECT * FROM `students` ";
		List<Student> studentsList = jdbcTemplate.query(Sql, new StudentRowMapper());

		return studentsList;
	}

	@Override
	public void save(Student student) {
		String sql = "INSERT INTO `students`(`name`, `mobile`, `country`, `dob`, `bload_group`, `gender`) VALUES (?,?,?,?,?,?)";
		//String sql = "INSERT INTO `students`(`name`, `mobile`, `country`) VALUES (?,?,?)";
		Object args[] = { student.getName(), student.getMobile(), student.getCountry(), student.getDob(),
				student.getBlood_group(), student.getGender() };
		jdbcTemplate.update(sql, args);

	}
	

	@Override
	public boolean delete(int id) {

		String sql = "DELETE FROM `students` WHERE id = ?";
		int idNum = jdbcTemplate.update(sql, id);
		return idNum == 1;
	}

	@Override
	public Student getStudent(int id) {

		String sql = "SELECT * FROM `students` WHERE  id = ? ";

		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void update(Student student) {

		String sql = "UPDATE `students` SET `name`= ?,`mobile`= ?,`country`= ? WHERE id = ? ";
		Object[] args = { student.getName(), student.getMobile(), student.getCountry(), student.getId() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public List<Student> search(String name) {
		String sql = "SELECT * FROM `students` WHERE  name = ? ";

		List<Student> queryForObject = (List<Student>) jdbcTemplate.query(sql, new StudentRowMapper(), name);

		return queryForObject;

	}

	@Override
	public void saveMark(MarksStudent student) {
		String sql = "INSERT INTO `marks`(`studentId`, `c`, `java`, `python`, `data_structure`) VALUES (?,?,?,?,?)";
		Object[] args = {student.getIdStudent(),student.getC(),student.getJava(),student.getPython(),student.getData_structure()};
		jdbcTemplate.update(sql, args);
		
	}

	@Override
	public List<MarksStudent> getMarkStudent(int id) {
		String sql = "SELECT `studentId`, `c`, `java`, `python`, `data_structure` FROM `marks` WHERE studentId =?";
		 List<MarksStudent> query = jdbcTemplate.query(sql, new MarkStudentRowMapper(), id);
		return query;
	}

}
