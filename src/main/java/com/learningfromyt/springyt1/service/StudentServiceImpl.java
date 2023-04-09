package com.learningfromyt.springyt1.service;

import com.learningfromyt.springyt1.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentDao studentDao;
    @Override
    public List<Student> getAllStudents() {
          return  studentDao.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return studentDao.findStudentByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentDao.deleteStudent(email);

    }
}
