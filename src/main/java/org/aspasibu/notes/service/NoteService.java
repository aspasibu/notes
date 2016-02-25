package org.aspasibu.notes.service;

import java.util.List;

import org.aspasibu.notes.entity.Note;

public interface NoteService {

	void addNote(Note note);

	List<Note> findAll();
}
