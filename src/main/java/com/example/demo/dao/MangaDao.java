package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Manga;

public interface MangaDao extends JpaRepository<Manga, Integer>{

}
