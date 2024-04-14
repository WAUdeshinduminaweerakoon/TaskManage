package com.example.TaskManager.service;

import com.example.TaskManager.dto.request.UserRequestDTO;
import com.example.TaskManager.model.User;

public interface UserService {
    User createUser(UserRequestDTO user);
}
