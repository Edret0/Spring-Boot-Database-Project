package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.Schedule;
import com.restfulApi.SpringBootCrud.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping("/schedules")
    public List<Schedule> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/schedules")
    public void addSchedule(@RequestBody Schedule schedule){
        scheduleService.addSchedule(schedule);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/schedules/{id}")
    public void updateSchedule(@PathVariable Long id, @RequestBody Schedule schedule){
        scheduleService.updateSchedule(id,schedule);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/schedules/{id}")
    public void deleteSchedule(@PathVariable Long id){
        scheduleService.deleteSchedule(id);
    }
}
