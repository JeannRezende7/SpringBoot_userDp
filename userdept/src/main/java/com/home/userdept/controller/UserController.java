package com.home.userdept.controller;

import java.util.List;

import com.home.userdept.entities.User;
import com.home.userdept.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<User> findAll() {
        List <User> result = repo.findAll();
        return result;

    }
    
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repo.findById(id).get();
        return result;

    }

    @PostMapping
	public User insert(@RequestBody User user) {
		return repo.save(user);
	}
    

}