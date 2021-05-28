package com.sample.springApp.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sample.springApp.util.OptionConverter;

import lombok.Data;

@Entity
@Data
public class Question {
	
	@Id
	@GeneratedValue
	private Integer questionId;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	@Convert(converter = OptionConverter.class)
	private List<Option> options;
	
	@Column 
	private String solution_option;	

}
