package com.sample.springApp.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class QuestionIdConverter implements AttributeConverter<List<Integer>, String> {

	@Override
	public String convertToDatabaseColumn(List<Integer> questionIds) {
		StringBuilder builder = new StringBuilder();
		for(Integer id : questionIds) {
			builder.append(id);
			builder.append(",");
		}	
		String idString = builder.toString();
		return idString.substring(0, idString.length()-1);
	}

	@Override
	public List<Integer> convertToEntityAttribute(String dbData) {
		List<Integer> questionIds = new ArrayList<Integer>();
		
		String[] ids = dbData.split(",");
		for(String id : ids) {
			questionIds.add(Integer.valueOf(id));
		}
		return questionIds;
	}

}
