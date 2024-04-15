package com.example.TaskManager.service.implementation;

import com.example.TaskManager.dto.request.TaskRequestDTO;
import com.example.TaskManager.model.Task;
import com.example.TaskManager.model.User;
import com.example.TaskManager.repository.TaskRepository;
import com.example.TaskManager.repository.UserRepository;
import com.example.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Task create(TaskRequestDTO taskRequestDTO){
        User user = userRepository.findById(taskRequestDTO.getUserId()).orElse((null));
        if (user == null){
            //TODO:Handle the case when member is not found
            // You can throw an exception or handle it according to your application logic
        }
        Task task = new Task(
                user,
                taskRequestDTO.getTaskTitle(),
                taskRequestDTO.getTaskDescription(),
                taskRequestDTO.getTaskStatus()
        );
        Task createTask = taskRepository.save(task);
        return createTask;
    }


}
