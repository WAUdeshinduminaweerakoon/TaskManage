package com.example.TaskManager.controller;

import com.example.TaskManager.dto.request.TaskRequestDTO;
import com.example.TaskManager.dto.response.TaskResponseDTO;
import com.example.TaskManager.model.Task;
import com.example.TaskManager.service.TaskService;
import com.example.TaskManager.service.implementation.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/create")
    public ResponseEntity<TaskResponseDTO> createTask(@RequestBody TaskRequestDTO taskRequestDTO){
        Task task = taskService.save(taskRequestDTO);
        System.out.println(task);
        TaskResponseDTO taskResponseDTO = new TaskResponseDTO(
                task.getTaskId(),
                task.getTaskTitle(),
                task.getTaskDescription(),
                task.getTaskStatus(),
                task.getUser().getUserId(),
                task.getUser().getName()

        );
        return ResponseEntity.ok().body(taskResponseDTO);

    }

}
