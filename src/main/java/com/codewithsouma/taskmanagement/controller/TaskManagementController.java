package com.codewithsouma.taskmanagement.controller;

import com.codewithsouma.taskmanagement.model.Task;
import com.codewithsouma.taskmanagement.service.TaskManagementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskManagementController {
    private final TaskManagementService service;

    @PostMapping(path = "/saveTask")
    public void addTask(@RequestBody Task task){
        service.addTask(task);
    }

    @GetMapping(path = "/alltasks")
    public List<Task> getAllTask(){
        return service.getAllTask();
    }

    @GetMapping(path = "/getTask")
    public Task getTaskById(@RequestParam int id){
        return service.getTaskById(id);
    }

    @DeleteMapping(path = "/deleteTask")
    public void deleteTaskById(@RequestParam int id){
        service.deleteTaskById(id);
    }


}
