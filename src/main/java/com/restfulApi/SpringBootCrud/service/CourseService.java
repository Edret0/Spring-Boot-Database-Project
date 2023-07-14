package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Course;
import com.restfulApi.SpringBootCrud.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    public CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Long id, Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }


}