package com.example.app.service;

import java.util.List;
import java.util.Optional;

import com.example.app.model.Todo;

public interface TodoService {

	List<Todo> findAll();
	Optional<Todo> findById(Long id);
	Todo create(Todo todo);
	void update(Todo todo);
	void deleteById(Long id);
}
