package com.sample.springApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springApp.models.Quiz;
import com.sample.springApp.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/save")
	public void saveQuiz(@RequestBody Quiz quiz) {
		quizService.saveQuiz(quiz);
	}
	
	@GetMapping("/getAll")
	public Iterable<Quiz> getAllQuiz(Quiz quiz) {
		return quizService.getAll();
	}

}
