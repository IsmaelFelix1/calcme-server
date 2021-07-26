package com.test.calcmeServer.controller;

import com.test.calcmeServer.entity.User;
import com.test.calcmeServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public  ResponseEntity<User> insert(@Valid @RequestBody User obj){
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
}
