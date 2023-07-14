package com.restfulApi.SpringBootCrud.controller;

import com.restfulApi.SpringBootCrud.bean.User;
import com.restfulApi.SpringBootCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/login")
    public ResponseEntity<String> loginUser(@RequestBody User user){
        User existingUser = userService.userRepository.findByUsername(user.getUsername());
        if(existingUser == null){
            return ResponseEntity.badRequest()
                    .body("account does not exist");
        }
        else if(!existingUser.getPassword().equals(user.getPassword())){
            return ResponseEntity.ok("Password or username is incorrect");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello " + existingUser.getUsername() +
                " your password is " + existingUser.getPassword());
        return ResponseEntity.ok(stringBuilder.toString());

    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        userService.registerUser(user);
        String message = """
                Account has been created
                """;
        return ResponseEntity.ok(message);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user){
        userService.updateUser(id,user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
