package com.example.TaskManager.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO {
    private int taskId;
    private String taskTitle;
    private String taskDescription;
    private String taskStatus;
    private int userId;
    private  String userName;

}
