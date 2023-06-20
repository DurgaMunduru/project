package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.NoteExistsException;
import com.dxc.model.NoteThis;
import com.dxc.service.NoteService;

@RestController
@RequestMapping("/note")
public class NoteController {

	@Autowired
	private NoteService service;
	
	@PostMapping("/addnote")
	public NoteThis addNote(@RequestBody NoteThis note) throws NoteExistsException{
		return service.addNote(note);
	}
	
	@GetMapping("/allnotes")
	public List<NoteThis> getNotes(){
		return service.getAllNotes();
	}
	
	@PutMapping("/updatenote")
	public NoteThis update(@RequestBody NoteThis note) {
		return service.update(note);
	}
	
	@DeleteMapping("/deletenote/{noteid}")
	public void delete(@PathVariable String noteid) {
		 service.delete(noteid);
	}
	
}
