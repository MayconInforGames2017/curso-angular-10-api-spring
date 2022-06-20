package com.mayconinforgames.todo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String description;

	@Column
	private Boolean done; // Indica se a tarefa foi feita ou não
	
	@Column
	private LocalDateTime createdDate; // Data da criação da tarefa
	
	@Column
	private LocalDateTime doneDate; // Data da conclusão da tarefa
	
}
