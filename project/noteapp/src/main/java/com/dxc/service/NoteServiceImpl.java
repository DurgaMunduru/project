package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.NoteExistsException;
import com.dxc.model.NoteThis;
import com.dxc.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository repo;
	
	
	public NoteThis addNote(NoteThis note) throws NoteExistsException {
		Optional<NoteThis> newnote = repo.findById(note.getNoteid());
		if(newnote.isPresent())
			throw new NoteExistsException();
		else
			return repo.save(note);
	}

	
	public List<NoteThis> getAllNotes() {
		List<NoteThis> notelist = repo.findAll();
		if(notelist.size()>0)
			return notelist;
		else
			return null;
	}

	
	public NoteThis update(NoteThis note) {
		
		return repo.save(note);
	}

	
	public void delete(String noteid) {
		repo.deleteById(noteid);;

	}

}
