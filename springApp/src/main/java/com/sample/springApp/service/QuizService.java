package com.sample.springApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springApp.models.Quiz;
import com.sample.springApp.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepo;
	
	public void saveQuiz(Quiz quiz) {
		quizRepo.save(quiz);
	}
	
	public Iterable<Quiz> getAll() {
		return quizRepo.findAll();
	}

}
