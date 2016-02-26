package org.aspasibu.notes.controller;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.aspasibu.notes.entity.Note;
import org.aspasibu.notes.service.NoteService;

@ManagedBean

public class NoteController {

	@ManagedProperty(value = "#{note}")
	private Note note;

	@ManagedProperty(value = "#{noteServiceImpl}")
	private NoteService noteService;

	public List<Note> findAll() {
		return noteService.findAll();
	}

	public void addNote() {
		note.setDate(new Date());
		noteService.addNote(note);
	}

	/**
	 * @return the note
	 */
	public Note getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(Note note) {
		this.note = note;
	}

	/**
	 * @return the noteService
	 */
	public NoteService getNoteService() {
		return noteService;
	}

	/**
	 * @param noteService
	 *            the noteService to set
	 */
	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}
}
