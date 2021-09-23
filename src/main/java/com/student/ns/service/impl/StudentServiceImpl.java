package com.student.ns.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.ns.entity.Student;
import com.student.ns.repository.StudentRepository;
import com.student.ns.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	// inject dependency 
	private StudentRepository studentRepository;

	 
	/**
	 * @param studentRepository
	 */
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
	}


	
	

}
