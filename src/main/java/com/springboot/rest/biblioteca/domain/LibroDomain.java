package com.springboot.rest.biblioteca.springboot2restservicebasic.domain;

import java.util.List;

import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.LibroEntity;

public interface LibroDomain {

	List<LibroEntity> findAll();
}
