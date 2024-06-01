package com.wini.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wini.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
