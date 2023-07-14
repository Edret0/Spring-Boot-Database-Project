package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Enrollement;
import com.restfulApi.SpringBootCrud.service.EnrollementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnrollementController {
    @Autowired
    private EnrollementService enrollementService;

    @RequestMapping("/enrollements")
    public List<Enrollement> getAllEnrollements(){
        return enrollementService.getAllEnrollements();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/enrollements")
    public void addEnrollement(@RequestBody Enrollement enrollement){
        enrollementService.addEnrollement(enrollement);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/enrollements/{id}")
    public void updateEnrollement(@PathVariable Long id, @RequestBody Enrollement enrollement){
        enrollementService.updateEnrollement(id,enrollement);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/enrollements/{id}")
    public void deleteEnrollement(@PathVariable Long id){
        enrollementService.deleteEnrollement(id);
    }
}
