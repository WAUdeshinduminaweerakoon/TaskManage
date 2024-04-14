package com.example.TaskManager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequestDTO {
    private int userId;
    private String taskTitle;
    private String taskDescription;
    private String taskStatus;

}
