package com.example.cs425_assignment_eregistrar.repository;

import com.example.cs425_assignment_eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
