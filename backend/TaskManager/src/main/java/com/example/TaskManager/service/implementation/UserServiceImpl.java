package com.example.TaskManager.service.implementation;

import com.example.TaskManager.dto.request.UserRequestDTO;
import com.example.TaskManager.model.User;
import com.example.TaskManager.repository.UserRepository;
import com.example.TaskManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestDTO userRequestDTO) {
        User user = new User(userRequestDTO.getUserName());
        return userRepository.save(user);
    }
}
