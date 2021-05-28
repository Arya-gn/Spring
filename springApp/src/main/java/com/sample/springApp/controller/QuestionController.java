package com.sample.springApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springApp.models.Question;
import com.sample.springApp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/save")
	public void saveQuestion(@RequestBody Question question) {
		questionService.saveQuestion(question);
	}
	
	@GetMapping("/getAll") 
	public Iterable<Question> getAllQuestions() {
		return questionService.getAll();
	}
}
