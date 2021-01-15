package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategoryDao;
import com.example.demo.dao.ChapterDao;
import com.example.demo.dao.ImageDao;
import com.example.demo.dao.LikeListDAO;
import com.example.demo.dao.MangaDao;
import com.example.demo.dao.PostDao;
import com.example.demo.dao.UserDao;
import com.example.demo.model.Category;
import com.example.demo.model.Chapter;
import com.example.demo.model.Image;
import com.example.demo.model.LikeList;
import com.example.demo.model.Manga;
import com.example.demo.model.User;

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
	@Autowired
	LikeListDAO ll;
	
//	@RequestMapping("/test4")
//	public List<CategoryManga> test4 () {
//		return cmd.findAll();	
//	}
	
	@RequestMapping("/likelists")
	public LikeList testll (@RequestParam int id) {
		return ll.findById(id).get();
	}
	@RequestMapping("/likelist")
	public List<LikeList> testlll () {
		return ll.findAll();
	}

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
	@RequestMapping("/manga/find")
	public Manga findManga(@RequestParam String name) {
		return mg.findByName(name);
	}
	@RequestMapping("/category/find")
	public List<Manga> categoryfind(@RequestParam int id) {
		return cg.findById(id).get().getMangas();
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
