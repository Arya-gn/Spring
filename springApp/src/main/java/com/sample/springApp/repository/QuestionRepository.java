package com.sample.springApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.springApp.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
