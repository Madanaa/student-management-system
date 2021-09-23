package com.student.ns.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.ns.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findAll();

}
