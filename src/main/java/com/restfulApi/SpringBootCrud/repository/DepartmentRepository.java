package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
