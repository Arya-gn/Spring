package com.sample.springApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springApp.models.Question;
import com.sample.springApp.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepo;
	
	public void saveQuestion(Question question) {
		questionRepo.save(question);
	}

	public Iterable<Question> getAll() {
		return questionRepo.findAll();
	}
}
