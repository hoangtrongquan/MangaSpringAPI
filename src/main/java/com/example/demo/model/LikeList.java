package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class LikeList {
	@Id
	int id;
	
	@OneToOne 
    @JoinColumn(name = "id_user") 
	User user;
	
//	@ManyToMany(mappedBy = "likelist")
//	List<Manga> mangas;

	@ManyToMany
	@JoinTable(name = "likelist_manga", joinColumns = @JoinColumn(name = "id_likelist"), inverseJoinColumns = @JoinColumn(name = "id_manga"))
	List<Manga> mangas;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Manga> getMangas() {
		return mangas;
	}

	public void setMangas(List<Manga> mangas) {
		this.mangas = mangas;
	}

	@Override
	public String toString() {
		return "LikeList [id=" + id + ", user=" + user + ", mangas=" + mangas + "]";
	}

	
	
	
}
