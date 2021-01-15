package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	@Id
	int id;
	int id_chap; 
	@ManyToOne
	@JoinColumn(name = "ID_CHAP",insertable = false,updatable = false)
	Chapter chap;
	
	String img;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_chap() {
		return id_chap;
	}
	public void setId_chap(int id_chap) {
		this.id_chap = id_chap;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
