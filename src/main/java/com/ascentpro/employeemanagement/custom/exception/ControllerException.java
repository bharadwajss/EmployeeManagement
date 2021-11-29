package com.ascentpro.employeemanagement.custom.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControllerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4470859401270708727L;
	private String errorCode;
	private String errorMessage;
	

}
