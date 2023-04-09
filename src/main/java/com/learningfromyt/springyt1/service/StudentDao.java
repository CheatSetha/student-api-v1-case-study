package com.learningfromyt.springyt1.service;

import com.learningfromyt.springyt1.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentDao {
    private final List<Student > studentList = new ArrayList<>();

    public List<Student> getAllStudents() {
        return  studentList;
    }


    public Student saveStudent(Student student) {
        studentList.add(student);
        return student;
    }


    public Student findStudentByEmail(String email) {
        return studentList.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
    }


    public void deleteStudent(String email) {
        var student = findStudentByEmail(email);
        if (student !=null){
            studentList.remove(student);
        }


    }
}
