package com.example.TaskManager.controller;

import com.example.TaskManager.dto.request.TaskRequestDTO;
import com.example.TaskManager.dto.request.UserRequestDTO;
import com.example.TaskManager.dto.response.UserResponseDTO;
import com.example.TaskManager.model.User;
import com.example.TaskManager.repository.UserRepository;
import com.example.TaskManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")

    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO){
        User user = userService.createUser(userRequestDTO);
        System.out.println(user);
        UserResponseDTO userResponseDTO = new UserResponseDTO(
                user.getUserId(),
                user.getName()
        );
        return ResponseEntity.ok().body(userResponseDTO);
    }

}
// get all , delet , update