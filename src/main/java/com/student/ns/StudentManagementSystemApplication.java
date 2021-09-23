package com.student.ns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.ns.entity.Student;
import com.student.ns.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Ajo","John","ajojohn@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Surendra","Puri","surendrapuri@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Madan","Madanaa","madan@gmail.com");
		studentRepository.save(student3);
		*/
	}

}
