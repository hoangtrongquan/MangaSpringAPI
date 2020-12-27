package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CategoryManga {
	@Id
	int id;  

	@ManyToOne()
	@JoinColumn(name = "id_category", updatable = false, insertable = false)
	Category category_id;

	@ManyToOne()
	@JoinColumn(name = "id_manga", updatable = false, insertable = false)
	Manga manga_id;

	public CategoryManga() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}

	public Manga getManga_id() {
		return manga_id;
	}

	public void setManga_id(Manga manga_id) {
		this.manga_id = manga_id;
	}



}
