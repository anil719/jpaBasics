package com.example.BasicsOfJP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("userId")int userId){
        return userService.getUser(userId);
    }

    @PatchMapping("/deleteUser")
    public void deleteUser(@RequestParam("id")int id){
        userService.deleteUser(id);
    }


    @DeleteMapping("deleteAll")
    public void delete(){
        userService.delete();
    }
}
