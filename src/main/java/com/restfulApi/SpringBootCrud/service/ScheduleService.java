package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.Schedule;
import com.restfulApi.SpringBootCrud.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    public ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules(){
        List<Schedule> schedules = new ArrayList<>();
        scheduleRepository.findAll().forEach(schedules::add);
        return schedules;
    }

    public void addSchedule(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void updateSchedule(Long id, Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
