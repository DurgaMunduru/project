package com.dxc.exception;

public class NoteExistsException extends Exception {

	public NoteExistsException() {
		super();
	}
	public NoteExistsException(String msg) {
		super(msg);
	}
}
