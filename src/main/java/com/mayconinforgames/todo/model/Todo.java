package com.mayconinforgames.todo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime createdDate; // Data da criação da tarefa
	
	@Column
	private LocalDateTime doneDate; // Data da conclusão da tarefa

	@PrePersist
	public void beforeSave() {
		setCreatedDate(LocalDateTime.now());
	}
	
}
