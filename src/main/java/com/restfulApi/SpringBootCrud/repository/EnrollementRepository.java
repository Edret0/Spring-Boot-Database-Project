package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.Enrollement;
import org.springframework.data.repository.CrudRepository;

public interface EnrollementRepository extends CrudRepository<Enrollement,Long> {
}
