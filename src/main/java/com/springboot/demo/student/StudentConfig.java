package com.springboot.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    // bean 是什么与 spring boot 的底层结构？？？（1）
    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
        return args -> {
            Student maria = new Student("Maria", "maria@neu.edu",  LocalDate.of(1990, 5, 15));
            Student alex = new Student("Alex", "alex@nyu.edu",  LocalDate.of(2000, 7, 20));
            studentRepo.saveAll(
                    List.of(maria, alex)
            );
        };
    }
}
