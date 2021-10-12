package com.zabdwi.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zabdwi.api.MarksStudent;

public class MarkStudentRowMapper implements RowMapper<MarksStudent> {

	@Override
	public MarksStudent mapRow(ResultSet rs, int rowNum) throws SQLException {
		MarksStudent marksStudent = new MarksStudent();
				
		marksStudent.setC(rs.getInt(2));
		marksStudent.setData_structure(rs.getInt(5));
		marksStudent.setJava(rs.getInt(3));
		marksStudent.setPython(rs.getInt(4));
		
		
		return marksStudent;
	}

}
