package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CategoryManga {
	@Id
	int id;  

	@ManyToOne
	@Column(name = "id_category")
	Category id_category;

	@ManyToOne
	@Column(name = "id_manga")
	Manga id_manga;

	public CategoryManga() {}

	public int getId() {
		return id;
	}

	public Category getId_category() {
		return id_category;
	}

	public void setId_category(Category id_category) {
		this.id_category = id_category;
	}

	public Manga getId_manga() {
		return id_manga;
	}

	public void setId_manga(Manga id_manga) {
		this.id_manga = id_manga;
	}

	public void setId(int id) {
		this.id = id;
	}





}
