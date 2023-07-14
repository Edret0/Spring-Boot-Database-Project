package com.restfulApi.SpringBootCrud.repository;

import com.restfulApi.SpringBootCrud.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
