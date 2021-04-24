package com.todo.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;
import com.todo.application.model.TodoItem;
import com.todo.application.repos.TodoRepos;

@RestController
@RequestMapping(value = "/todo")
public class todoappcontroller {
	@Autowired
	private TodoRepos todoRepo;

	@GetMapping
	public List<TodoItem> findAll() {
		return todoRepo.findAll();
	}

	@PostMapping
	public TodoItem save(@Validated @NotNull @RequestBody TodoItem todoItem) {
		return todoRepo.save(todoItem);
	}

	@PutMapping
	public TodoItem update(@Validated @NotNull @RequestBody TodoItem todoItem) {
		return todoRepo.save(todoItem);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		todoRepo.deleteById(id);
	}
}
