package com.parthiv.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
	public ErrorDetails(String message2, String description, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}
	private String error;
	private String message;
	private LocalDateTime timestamp;

}
