package com.springboot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

/** responsible for business logic */
@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> studentOptional = studentRepo.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email has already existed");
        }
        studentRepo.save(student);
    }

    public void deleteStudent(Long studentId) {
        if (!studentRepo.existsById(studentId)) {
            throw new IllegalStateException("student with id: " + studentId + " does not exist");
        }
        studentRepo.deleteById(studentId);
    }

    // 表明使用 setter 来更新数据库，不需要使用 query
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepo.findById(studentId)
                .orElseThrow(() ->
                        new IllegalStateException("student with id: " + studentId + " does not exist"));
        if (name != null && name.length() > 0) student.setName(name);
        if (email != null && email.length() > 0) student.setEmail(email);
    }
}
