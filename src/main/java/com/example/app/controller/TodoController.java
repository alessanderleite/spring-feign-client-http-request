package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.client.TodoClient;
import com.example.app.dto.TodoDto;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

	@Autowired
	TodoClient todoClient;
	
	@GetMapping("/todos")
	public List<TodoDto> getTodos() {
		return todoClient.getTodos();
	}
}
