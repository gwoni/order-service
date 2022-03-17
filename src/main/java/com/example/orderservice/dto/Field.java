package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Field {
	private String type;
	private boolean optional;
	private String field;

}
