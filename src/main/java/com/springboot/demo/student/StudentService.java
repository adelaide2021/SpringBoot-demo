package com.springboot.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/** responsible for business logic */
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Maria",
                        "maria@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 10),
                        21
                )
        );
    }
}
