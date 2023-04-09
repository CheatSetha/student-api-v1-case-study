package com.learningfromyt.springyt1.service;

import com.learningfromyt.springyt1.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
     List<Student> getAllStudents();
     Student saveStudent(Student student);
     Student findStudentByEmail(String email);
     void deleteStudent(String email);
}
