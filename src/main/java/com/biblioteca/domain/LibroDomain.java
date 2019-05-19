package com.biblioteca.domain;

import java.util.List;

import com.biblioteca.entity.LibroEntity;


public interface LibroDomain {

	List<LibroEntity> findAll();
}
