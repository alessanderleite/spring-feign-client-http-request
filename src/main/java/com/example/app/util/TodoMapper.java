package com.example.app.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.app.dto.TodoDto;
import com.example.app.model.Todo;

@Component
public class TodoMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public Todo convertDtoToEntity(TodoDto dto) {
		Todo todo = modelMapper.map(dto, Todo.class);
		return todo;
	}
	
	public TodoDto convertEntityToDto(Todo todo) {
		TodoDto dto = modelMapper.map(todo, TodoDto.class);
		return dto;
	}
}
