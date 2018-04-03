package com.todos.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todos {
	public Todos() {
		 
		 
	}
 
	public Todos(String _todos,String _active) {
		super();
		this.todos=_todos;
		this.active=_active;
		 
	}
	public Todos(int _id,String _todos,String _active) {
		super();
		this.id=_id;
		this.todos=_todos;
		this.active=_active;
		 
	}
	@Id
	private int id;
	private String todos;
	private String active;
	public String getTodos() {
		return todos;
	}
	public void setTodos(String todos) {
		this.todos = todos;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 

}
