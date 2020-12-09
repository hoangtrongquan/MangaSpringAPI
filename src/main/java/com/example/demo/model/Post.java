package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	int id; 
	String comment; 
	@ManyToOne
	@JoinColumn(name = "IDUSER")
	User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}
