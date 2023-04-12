package com.example.BasicsOfJP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User Added Successfully";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User  getUser(int userId){
        return userRepository.findById(userId).get();
    }

    public void deleteUser(int userId){
        userRepository.deleteById(userId);
    }

    public void delete(){
        userRepository.deleteAll();
    }
}
