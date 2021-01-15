package com.example.demo.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Manga {
	@Id
	int id;
	String name;
	String description;
	String view;
	boolean status;
	int like;
	int follow;
	String author;
	@OneToMany(mappedBy = "manga")
	List<Chapter> chapters;
	String create_by;
	Date create_at;
	Date update_at;
	String avatar;
	int id_observer;
	boolean enable;

	@ManyToMany
	@JoinTable(name = "category_manga", joinColumns = @JoinColumn(name = "id_category"), inverseJoinColumns = @JoinColumn(name = "id_manga"))
	List<Category> category;

//	@ManyToMany
//	@JoinTable(name = "likelist_manga", joinColumns = @JoinColumn(name = "id_likelist"), inverseJoinColumns = @JoinColumn(name = "id_manga"))
//	List<LikeList> likelist;
	@ManyToMany(mappedBy = "mangas")
	List<LikeList> likeLists;

	

	
	public List<String> getCategory() {
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < category.size(); i++) {
			l.add(category.get(i).getName());
		}
		return l;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getFollow() {
		return follow;
	}

	public void setFollow(int follow) {
		this.follow = follow;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getId_observer() {
		return id_observer;
	}

	public void setId_observer(int id_observer) {
		this.id_observer = id_observer;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", name=" + name + ", description=" + description + ", view=" + view + ", status="
				+ status + ", like=" + like + ", follow=" + follow + ", author=" + author + ", chapters=" + chapters
				+ ", create_by=" + create_by + ", create_at=" + create_at + ", update_at=" + update_at + ", avatar="
				+ avatar + ", id_observer=" + id_observer + ", enable=" + enable + ", category=" + category
				+ ", likeLists=" + likeLists + "]";
	}

//	public List<LikeList> getLikeLists() {
//		return likeLists;
//	}

	public void setLikeLists(List<LikeList> likeLists) {
		this.likeLists = likeLists;
	}


	
}
