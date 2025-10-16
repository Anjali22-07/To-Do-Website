package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Task;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
//Transactional annotation provides the application the ability to declaratively control transaction boundaries on CDI managed beans, 
public class TaskDao {

	@PersistenceContext
	private EntityManager entityManager;  //An EntityManager instance is associated with a persistence context.
	//Within the persistence context, the entity instances and their lifecycle are managed. 
	//The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.


	//create task

      @Transactional
      public void SaveTask(Task task) {
    	  
    	  
    	  entityManager.merge(task);
    	 
    	 
      }
      
      //return list of Task
      
      public List<Task> getTask(){
    	  
    	  return entityManager.createQuery("SELECT t FROM Task t", Task.class)
                  .getResultList();
      }
      
      //delete task

      @Transactional
      public void delete(int taskId) {
    	  Task t = entityManager.find(Task.class, taskId);
          if (t != null) {
              entityManager.remove(t);
          }
      }
      
      // --- Single lookup method ---
      public Task getTaskById(int taskId) {
          return entityManager.find(Task.class, taskId);
          // returns null if no Task with that ID exists
      }
}
