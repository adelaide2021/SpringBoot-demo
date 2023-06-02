package com.springboot.demo;

import com.springboot.demo.student.Student;
import com.springboot.demo.student.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

// API Layer - Service Layer - Data Access Layer - Database
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
