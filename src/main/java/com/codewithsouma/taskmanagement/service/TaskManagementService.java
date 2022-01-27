package com.codewithsouma.taskmanagement.service;

import com.codewithsouma.taskmanagement.model.Task;
import com.codewithsouma.taskmanagement.repository.TaskManagementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskManagementService {
    private final TaskManagementRepository repository;

    public void addTask(Task newTask){
        Optional<Task> task = repository.findById(newTask.getTaskId());
        if(task.isPresent()) throw new IllegalStateException("taskId: "+task.get().getTaskId()+" is already present");

        repository.save(newTask);
    }

    public List<Task> getAllTask(){
        return repository.findAll();
    }

    public Task getTaskById(int id) {
        Optional<Task> task = repository.findById(id);
        if(task.isEmpty()) throw new IllegalStateException("Id: "+id+" is not found");

        return task.get();
    }

    public void deleteTaskById(int id) {
        repository.deleteById(id);
    }


}
