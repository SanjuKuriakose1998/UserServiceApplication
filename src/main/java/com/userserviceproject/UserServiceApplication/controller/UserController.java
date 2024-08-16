package com.userserviceproject.UserServiceApplication.controller;

import com.userserviceproject.UserServiceApplication.model.User;
import com.userserviceproject.UserServiceApplication.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userId}")
    public User getUserDetails(@PathVariable("userId") String userId){

        return userService.getUser(userId);
    }

    @GetMapping()
    public List<User> getAllUserDetails(){

        return userService.getAllUsers();
    }

    @PostMapping
    public String createUserDetails(@RequestBody User user){
        userService.createUser(user);
        return "User Details Created Successfully";
    }

    @PutMapping
    public String updateUserDetails(@RequestBody User user){
        userService.updateUser(user);
        return "User Details Updated Successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User Details Deleted Successfully";
    }
}