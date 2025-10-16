package com.model;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int taskId;
	private String taskTitle;
	private String taskContent;
	private LocalDateTime dueTime;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskContent=" + taskContent + ", dueTime="
				+ dueTime + "]";
	}
	public Task(int taskId, String taskTitle, String taskContent, LocalDateTime dueTime) {
		super();
		this.taskId = taskId;
		this.taskTitle = taskTitle;
		this.taskContent = taskContent;
		this.dueTime = dueTime;
	}
	public Task() {
		super();
	}
	public LocalDateTime getDueTime() {
		return dueTime;
	}
	public void setDueTime(LocalDateTime dueTime) {
		this.dueTime = dueTime;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	
	
}
