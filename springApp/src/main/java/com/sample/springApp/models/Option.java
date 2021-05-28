package com.sample.springApp.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class Option implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer optionId;
	
	private String content;

}
