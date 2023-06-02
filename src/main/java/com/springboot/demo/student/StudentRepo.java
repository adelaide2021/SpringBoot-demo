package com.springboot.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// extend JpaRepository / PagingAndSortingRepository / CrudRepository 中的一个以在java中实现对数据库增删改查
// <> 内是 type of object, type of id
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
