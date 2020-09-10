package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user")
    public List<User> getUser(){
        return userRepository.findAll();
    }
}
