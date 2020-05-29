package com.example.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.model.Todo;
import com.example.app.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}

	@Override
	public Optional<Todo> findById(Long id) {
		return todoRepository.findById(id);
	}

	@Override
	public Todo create(Todo todo) {
		return todoRepository.save(todo);
	}

	@Override
	public void update(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void deleteById(Long id) {
		Optional<Todo> todo = findById(id);
		
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

}
