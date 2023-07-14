package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Student;
import com.restfulApi.SpringBootCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public List<Student> getAllStudentsWhereStudentIdIsGreaterThanThree(){
        return studentRepository.findAllByIdGreaterThanEqual(3L);
    }

    public List<Student> findAllStudentsByEmail(String email){
        return studentRepository.findAllStudentsByEmail(email);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
