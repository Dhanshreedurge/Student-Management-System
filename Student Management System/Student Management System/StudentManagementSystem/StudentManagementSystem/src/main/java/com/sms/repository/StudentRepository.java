package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
