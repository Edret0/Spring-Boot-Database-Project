package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Department;
import com.restfulApi.SpringBootCrud.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    
    @Autowired
    public DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        List<Department> departments = new ArrayList<>();
        departmentRepository.findAll().forEach(departments::add);
        return departments;
    }

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void updateDepartment(Long id, Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
