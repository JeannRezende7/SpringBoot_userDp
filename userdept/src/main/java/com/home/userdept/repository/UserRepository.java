package com.home.userdept.repository;

import com.home.userdept.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long>{
    
}
