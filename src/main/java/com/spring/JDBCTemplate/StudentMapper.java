package com.spring.JDBCTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper{
public Object mapRow(ResultSet rs,int rowNum) throws SQLException{
	Student students=new Student();
	students.setId(rs.getInt("stud_id"));
	students.setName(rs.getString("stud_name"));
	students.setMark(rs.getInt("mark"));
	
	return students;
}
}
