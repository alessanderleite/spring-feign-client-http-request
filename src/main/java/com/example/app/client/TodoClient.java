package com.example.app.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.dto.TodoDto;

@FeignClient(name = "TodoClient", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {

	@GetMapping(value = "/todos", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<TodoDto> getTodos();
}
