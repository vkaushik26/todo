package com.todo.application.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.application.model.TodoItem;

public interface TodoRepos extends JpaRepository<TodoItem, Long> {

}
