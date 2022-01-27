package com.codewithsouma.taskmanagement.repository;

import com.codewithsouma.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskManagementRepository extends JpaRepository<Task,Integer> {

}
