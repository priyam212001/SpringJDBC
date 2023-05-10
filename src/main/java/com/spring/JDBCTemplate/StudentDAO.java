package com.spring.JDBCTemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudent(Student s) {
		String query = "insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getMark()+"')";
		return jdbcTemplate.update(query);
	}
	public int updateStudent(Student s) {
		String query = "update student set stud_name='"+s.getName()+"',mark='"+s.getMark()
		+"' where stud_id='"+s.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteStudent(Student s) {
		String query="delete from student where stud_id='"+s.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public List<Student> listStudents(){
		String SQL = "select * from student";
		List<Student> students= jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	
	
	
	}
}