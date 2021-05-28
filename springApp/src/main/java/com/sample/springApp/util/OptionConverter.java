package com.sample.springApp.util;

import java.util.List;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.springApp.models.Option;

@Converter
public class OptionConverter implements AttributeConverter<List<Option>, String>{

	@Override
	public String convertToDatabaseColumn(List<Option> options) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(options);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Option> convertToEntityAttribute(String dbData) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(dbData, new TypeReference<List<Option>>() {
			});
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
