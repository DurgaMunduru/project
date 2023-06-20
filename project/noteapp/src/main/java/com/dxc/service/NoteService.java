package com.dxc.service;

import java.util.List;

import com.dxc.exception.NoteExistsException;
import com.dxc.model.NoteThis;

public interface NoteService {

	NoteThis addNote(NoteThis note) throws NoteExistsException;
	
	List<NoteThis> getAllNotes();
	
	public NoteThis update(NoteThis note);
	
	public void delete(String noteid);
}
