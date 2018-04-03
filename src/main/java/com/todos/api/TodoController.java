package com.todos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoController {
	@Autowired
	private TodoService todoservice;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/todos")
	public List<Todos> getAllUsers(){
		 return todoservice.getTodos();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/todos/{activeStatus}")
	public List<Todos> getTodo(@PathVariable int activeStatus) {
		return todoservice.getTodosByStatus(activeStatus);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.POST,value="/todos")
	public void addTodo(@RequestBody Todos todo) {
		todoservice.addTodo(todo);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.PUT,value="/todos/{todoId}")
	public void updateTodo(@RequestBody Todos todos,@PathVariable String todoId) {
		todoservice.updateTodo(todos, todoId);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.DELETE,value="/todos/{todoId}")
	public void deleteUser(@PathVariable int todoId) {
		todoservice.deleteTodo(todoId);
	}
}
