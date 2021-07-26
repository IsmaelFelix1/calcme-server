package com.test.calcmeServer.service;

import com.test.calcmeServer.entity.User;
import com.test.calcmeServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User insert(User obj){
        return repo.insert(obj);
    }
}
