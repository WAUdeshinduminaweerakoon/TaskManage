package com.example.TaskManager.service;

import com.example.TaskManager.dto.request.TaskRequestDTO;
import com.example.TaskManager.model.Task;

public interface TaskService {

    Task save(TaskRequestDTO taskRequestDTO);
}
