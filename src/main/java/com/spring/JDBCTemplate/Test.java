package com.spring.JDBCTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDAO dao = (StudentDAO)context.getBean("jdbc");
//INSERT QUERY IN SPRING----------------------------		
//		int status = dao.saveStudent(new Student(17,"Priyam",46));
//		System.out.println("Status= "+status);

//UPDATE QUERY IN SPRING---------------------------------		
//		int status=dao.updateStudent(new Student(3,"Gautam",100));
//		System.out.println("Status= "+status);
		
//DELETE QUERY IN SPRING---------------------------------		
//		Student s=new Student();
//		s.setId(17);
//		int status=dao.deleteStudent(s);
//		System.out.println("Status= "+status);
		
//SELECT QUERY IN SPRING--------------------------------------		
		System.out.println("------listing multiple records------");
		List<Student> students = dao.listStudents();
		
		for (Student record : students) {
			System.out.print("ID:"+record.getId());
			System.out.print(" Name:"+record.getName());
			System.out.println(" Mark:"+record.getMark());
		}

	}

}