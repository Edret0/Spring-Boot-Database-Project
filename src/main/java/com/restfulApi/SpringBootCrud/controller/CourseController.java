package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Course;
import com.restfulApi.SpringBootCrud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course){
        courseService.updateCourse(id,course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }
}
