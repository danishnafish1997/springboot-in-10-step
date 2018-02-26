package com.demo.springboot.springbootin10step.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.springbootin10step.model.Todo;

public interface TodoRepository extends JpaRepository<Todo,Integer>{
	 List<Todo> findByUser(String user);

}
