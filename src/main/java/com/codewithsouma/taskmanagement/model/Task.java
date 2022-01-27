package com.codewithsouma.taskmanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "TASK_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
     private int taskId;
     private String taskHolderName;
     @JsonFormat(pattern = "MM/dd/YYYY")
     private Date taskDate;
     private String taskName;
     private String taskStatus;
}
