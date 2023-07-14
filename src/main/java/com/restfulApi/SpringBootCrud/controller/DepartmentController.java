package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Department;
import com.restfulApi.SpringBootCrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/departments/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Department department){
        departmentService.updateDepartment(id,department);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/departments/{id}")
    public void deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartment(id);
    }
}
