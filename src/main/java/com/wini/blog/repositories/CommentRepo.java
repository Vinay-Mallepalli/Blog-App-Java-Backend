package com.wini.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wini.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
