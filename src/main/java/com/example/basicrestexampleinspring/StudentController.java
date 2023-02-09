package com.example.basicrestexampleinspring;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    StudentList students;

    public StudentController() {
        students = StudentList.getInstance();
    }

    @GetMapping("/student")
    public List<Student> allStudents(){
        return students.GetStudentList();
    }

    @GetMapping("/student/{id}")
    public Student student(@PathVariable int id) {
        return students.GetStudent(id);
    }

    @PostMapping("/student")
    public Student newStudent(@RequestBody Student s) {
        students.AddStudent(s);
        return s;
    }
}
