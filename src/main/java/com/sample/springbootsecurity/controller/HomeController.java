package com.sample.springbootsecurity.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/home")

    public ResponseEntity<String> startHome(){

        return ResponseEntity.ok("<h1>this is home page</h1>");
    }

    @GetMapping("/dashboard")
    public ResponseEntity<String> startDashboard(){

        return ResponseEntity.ok("<h1>this is dashboard page</h1>");
    }

    @GetMapping("/manage")
    public ResponseEntity<String> startManage(){
        return ResponseEntity.ok("<h1>this is manage page</h1>");
    }
}
