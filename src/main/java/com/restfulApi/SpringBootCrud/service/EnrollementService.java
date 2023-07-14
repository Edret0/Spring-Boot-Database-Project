package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Enrollement;
import com.restfulApi.SpringBootCrud.repository.EnrollementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnrollementService {

    @Autowired
    public EnrollementRepository enrollementRepository;

    public List<Enrollement> getAllEnrollements(){
        List<Enrollement> enrollements = new ArrayList<>();
        enrollementRepository.findAll().forEach(enrollements::add);
        return enrollements;
    }

    public void addEnrollement(Enrollement enrollement) {
        enrollementRepository.save(enrollement);
    }

    public void updateEnrollement(Long id, Enrollement enrollement) {
        enrollementRepository.save(enrollement);
    }

    public void deleteEnrollement(Long id) {
        enrollementRepository.deleteById(id);
    }
}
