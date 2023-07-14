package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Professor;
import com.restfulApi.SpringBootCrud.bean.Student;
import com.restfulApi.SpringBootCrud.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @RequestMapping("/professors")
    public List<Professor> getAllProfessors(){
        return professorService.getAllProfessor();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/professors")
    public ResponseEntity<String> addProfessor(@RequestBody Professor professor){
        professorService.addProfessor(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body("Professor added");
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/professors/{id}")
    public ResponseEntity<String> updateProfessor(@PathVariable Long id, @RequestBody Professor professor){
        professorService.updateProfessor(id,professor);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Professor information updated");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/professors/{id}")
    public void deleteProfessor(@PathVariable Long id){
        professorService.deleteProfessor(id);
    }
}
