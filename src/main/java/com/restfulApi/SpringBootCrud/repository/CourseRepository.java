package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
}
