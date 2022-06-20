package com.mayconinforgames.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayconinforgames.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
