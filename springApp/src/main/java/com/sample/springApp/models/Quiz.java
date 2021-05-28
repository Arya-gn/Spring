package com.sample.springApp.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sample.springApp.util.QuestionIdConverter;

import lombok.Data;

@Entity
@Data
public class Quiz {
	
	@Id
	@GeneratedValue
	private Integer quizId;
	
	@Column
	private String quizName;
	
	@Convert(converter = QuestionIdConverter.class)
	private List<Integer> questionIds;
}
