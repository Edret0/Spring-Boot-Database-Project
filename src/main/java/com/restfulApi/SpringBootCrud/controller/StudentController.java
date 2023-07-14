package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Student;
import com.restfulApi.SpringBootCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/students1/")
    public List<Student> getAllStudentsWhereStudentidIsGreaterThanThree(){
        return studentService.getAllStudentsWhereStudentIdIsGreaterThanThree();
    }

    @RequestMapping("email")
    public List<Student> findAllStudentsByEmail(@RequestParam("email") String email){
        return studentService.findAllStudentsByEmail(email);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(id,student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
