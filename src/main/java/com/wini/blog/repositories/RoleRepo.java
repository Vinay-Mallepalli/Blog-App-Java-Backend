package com.wini.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wini.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
