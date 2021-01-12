package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Chapter;

public interface ChapterDao extends JpaRepository<Chapter, Integer>{

}
