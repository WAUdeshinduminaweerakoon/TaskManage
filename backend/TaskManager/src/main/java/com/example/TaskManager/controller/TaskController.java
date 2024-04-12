package com.example.TaskManager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @GetMapping
    public ResponseEntity<String> task() {
        System.out.println("Hello word");
        return ResponseEntity.ok("Hello word");
    }

}
