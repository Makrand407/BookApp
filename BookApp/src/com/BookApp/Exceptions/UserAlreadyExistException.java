package com.BookApp.Exceptions;

public class UserAlreadyExistException extends RuntimeException {
	public UserAlreadyExistException(String msg) {
		super(msg);
	}
}
