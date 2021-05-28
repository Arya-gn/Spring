package com.sample.springApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.springApp.models.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Integer>{

}
