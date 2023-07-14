package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {

    List<Student> findAllByIdGreaterThanEqual(Long id);

    @Query("SELECT s FROM Student s WHERE s.email LIKE %:email%")
    List<Student> findAllStudentsByEmail(@Param("email") String email);

}
