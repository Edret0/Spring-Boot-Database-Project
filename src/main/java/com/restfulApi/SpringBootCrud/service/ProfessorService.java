package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Professor;
import com.restfulApi.SpringBootCrud.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    public ProfessorRepository professorRepository;

    public List<Professor> getAllProfessor(){
        List<Professor> professorList = new ArrayList<>();
        professorRepository.findAll().forEach(professorList::add);
        return professorList;
    }

    public void addProfessor(Professor professor){
        professorRepository.save(professor);
    }

    public void updateProfessor(Long id, Professor professor){
        professorRepository.save(professor);
    }

    public void deleteProfessor(Long id){
        professorRepository.deleteById(id);
    }
}
