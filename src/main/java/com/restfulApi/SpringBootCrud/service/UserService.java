package com.restfulApi.SpringBootCrud.service;

import com.restfulApi.SpringBootCrud.bean.User;
import com.restfulApi.SpringBootCrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }


    public void registerUser(User user){
        userRepository.save(user);
    }

    public void updateUser(Long id, User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
