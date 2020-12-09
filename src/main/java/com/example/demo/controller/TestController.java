package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.model.CategoryDao;
import com.example.demo.model.Chapter;
import com.example.demo.model.ChapterDao;
import com.example.demo.model.Image;
import com.example.demo.model.ImageDao;
import com.example.demo.model.Manga;
import com.example.demo.model.MangaDao;
import com.example.demo.model.PostDao;
import com.example.demo.model.User;
import com.example.demo.model.UserDao;

@RestController
public class TestController {
	
	@Autowired
	UserDao ud;
	@Autowired
	PostDao pd;
	@Autowired
	MangaDao mg;
	@Autowired
	CategoryDao cg;
	@Autowired
	ChapterDao ct;
	@Autowired
	ImageDao img;
	@RequestMapping("/test")
	public List<User> test () {
		return ud.findAll();
	}
	@RequestMapping("/test1")
	public User test1 (@RequestParam int id) {
		return ud.findById(id).get();
	}
	@RequestMapping("/manga")
	public List<Manga> mangafindall() {
		return mg.findAll();
	}
	@RequestMapping("/category")
	public List<Category> categoryfindall() {
		return cg.findAll();
	}
	@RequestMapping("/chapter")
	public List<Chapter> chapterfindall() {
		return ct.findAll();
	}
	@RequestMapping("/img")
	public List<Image> imgfindall() {
		return img.findAll();
	}
	
}
