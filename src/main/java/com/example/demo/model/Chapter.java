package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Chapter {
	@Id
	int id;  
	String name_chapter;
	String update_day;
	@ManyToOne()
	@JoinColumn(name = "id_manga", updatable = false, insertable = false)
	Manga manga;
	@OneToMany(mappedBy = "chap")
	List<Image> imgs;
	
	public Chapter() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_chapter() {
		return name_chapter;
	}

	public List<Image> getImgs() {
		return imgs;
	}

	public void setImgs(List<Image> imgs) {
		this.imgs = imgs;
	}

	public void setName_chapter(String name_chapter) {
		this.name_chapter = name_chapter;
	}

	public String getUpdate_day() {
		return update_day;
	}

	public void setUpdate_day(String update_day) {
		this.update_day = update_day;
	}

}
