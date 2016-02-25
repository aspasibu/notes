package org.aspasibu.notes.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;

import org.aspasibu.notes.entity.Note;
import org.aspasibu.notes.service.NoteService;

@ManagedBean
@ApplicationScoped
public class NoteServiceImpl implements NoteService {

	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	
	public List<Note> getNotes() {
		return em.createNamedQuery("findAllNotes").getResultList();
	}


	public NoteServiceImpl() {
		emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
	}
	

	@Override
	public void addNote(Note note) {
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();

			em.persist(note);

			et.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Note> findAll() {
		return em.createNamedQuery("findAllNotes").getResultList();
	}
	

}
