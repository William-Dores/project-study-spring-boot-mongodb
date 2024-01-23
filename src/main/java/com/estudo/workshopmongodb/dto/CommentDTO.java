package com.estudo.workshopmongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date dateComent;
	private AuthorDTO author;
	
	
	public CommentDTO() {
	}


	public CommentDTO(String text, Date dateComent, AuthorDTO author) {
		super();
		this.text = text;
		this.dateComent = dateComent;
		this.author = author;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public Date getDateComent() {
		return dateComent;
	}


	public void setDateComent(Date dateComent) {
		this.dateComent = dateComent;
	}


	public AuthorDTO getAuthor() {
		return author;
	}


	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	
	

}
