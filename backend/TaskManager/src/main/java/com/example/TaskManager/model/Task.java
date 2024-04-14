package com.example.TaskManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String taskTitle;

    private String taskDescription;

    private String taskStatus;
    // pending, in progress, completed

    public Task(User user, String taskTitle, String taskDescription,String taskStatus ){
        this.user = user;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

}