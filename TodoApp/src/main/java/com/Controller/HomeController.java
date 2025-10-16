package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.TaskDao;
import com.model.Task;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class HomeController {
	
	@Autowired
	private TaskDao taskdao;
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/add_task")
	public String addTask() {
		
		return "add_task";
	}
	
	@RequestMapping("/viewTask")
      public String viewtask(Model m) {
		List<Task> tasks= taskdao.getTask();
		m.addAttribute("task", tasks);
		
		return "viewTask";
	}
	
	
	@RequestMapping("/handleForm")
	public RedirectView handleForm(@ModelAttribute Task task) {
		
		taskdao.SaveTask(task);
		RedirectView redirectview= new RedirectView();
		redirectview.setUrl("viewTask");
		
		return redirectview;
	}
	
	//delete handler
	@RequestMapping("/delete/{taskId}")
	public RedirectView deleteTask(@PathVariable("taskId") int taskid, HttpServletRequest request) {
		taskdao.delete(taskid);
		RedirectView redirectview= new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/viewTask");
	
		return redirectview;
	}
	
	@RequestMapping("/updateTask/{taskId}")
	public String updateTask(@PathVariable("taskId") int taskid, Model model) {
		
		Task task= taskdao.getTaskById(taskid);
		model.addAttribute("task", task);
		return "updateTask";
	}
}
