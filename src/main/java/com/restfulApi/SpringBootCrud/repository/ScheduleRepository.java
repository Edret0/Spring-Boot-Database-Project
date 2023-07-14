package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule,Long> {

}
