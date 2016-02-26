package org.aspasibu.notes.entity;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@ManagedBean
@Entity
@NamedQueries({ @NamedQuery(name = "findAllNotes", query = "select n from Note n order by n.date DESC") })
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	private String title;

	private String text;

	private Date date;

	public Note() {
	}

	public Note(String title, String text) {
		this.title = title;
		this.text = text;
		this.date = new Date();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
