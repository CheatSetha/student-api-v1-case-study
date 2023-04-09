package com.learningfromyt.springyt1.controller;
import com.learningfromyt.springyt1.model.Student;
import com.learningfromyt.springyt1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/{email}")
    public Student findStudentById( @PathVariable("email") String email ){
        return studentService.findStudentByEmail(email);
    }
    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email){
        studentService.deleteStudent(email);
    }
}
