package org.aspasibu.notes.controller;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.aspasibu.notes.entity.Note;
import org.aspasibu.notes.service.NoteService;

@ManagedBean
@RequestScoped
public class NoteController {

	@ManagedProperty(value = "#{noteServiceImpl}")
	private NoteService noteService;
	
	public List<Note> findAll() {
		return noteService.findAll();
	}
	
	public void addNote(Note note) {
		noteService.addNote(note);
	}
}
