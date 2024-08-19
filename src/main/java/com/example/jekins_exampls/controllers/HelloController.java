package com.example.jekins_exampls.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello/{name}")
    public ResponseEntity<String> sayHelloToDevelper(@PathVariable String name){
        return ResponseEntity.ok("Hello: " + name + " DevOps!!!");

    }
}
