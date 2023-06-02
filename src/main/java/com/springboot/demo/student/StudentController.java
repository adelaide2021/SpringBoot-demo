package com.springboot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** all resources for api */
@RestController
// make this class to server a restful end point
@RequestMapping(path = "api/student")
public class StudentController {
    // api-service-database structure
    private final StudentService studentService;

    // dependency injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
