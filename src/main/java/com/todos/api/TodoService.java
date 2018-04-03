package com.todos.api;

import java.util.ArrayList;

import java.util.List;
 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TodoService {
//	private ArrayList<Todos> todos=new ArrayList<>(Arrays.asList(
//			new Todos("1","Test data value","1"),
//			new Todos("2","Mike call","1")			 
//			));
//	
	@Autowired
	private TodoRepository todoRepository;
	
	
	public List<Todos> getTodos() {
		List<Todos> todos = new ArrayList<>();
		todoRepository.findAll()
		.forEach(todos::add);
		return todos;
	}
	
	public List<Todos> getTodosByStatus(int activeStatus) {
		List<Todos> todos = new ArrayList<>();
		todoRepository.findAll()
		.forEach(todos::add);
		return todos;
	}
	
	public void addTodo(Todos todo) {
		
		todoRepository.save(todo);
	}
	
	public void updateTodo(Todos todo,String todoId) {
//		for(int i=0; i<todos.size();i++ ) {
//			Todos u=todos.get(i);
//			if(u.getId().equals(todoId)) {
//				todos.set(i,todo);
//				return;
//			}
//		}
		todoRepository.save(todo);
	}
	
	public void deleteTodo(int todoId) {
		todoRepository.delete(todoId);
	}
	
}
