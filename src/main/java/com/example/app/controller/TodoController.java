package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.integration.TodoClient;
import com.example.app.vo.TodoVO;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

	@Autowired
	TodoClient todoClient;
	
	@GetMapping("/todos")
	public List<TodoVO> getTodos() {
		return todoClient.getTodos();
	}
}
