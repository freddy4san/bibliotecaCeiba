package com.springboot.rest.biblioteca.springboot2restservicebasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.biblioteca.springboot2restservicebasic.domain.LibroDomain;
import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.LibroEntity;

//import com.springboot.rest.biblioteca.springboot2restservicebasic.Libro;

@RestController
@RequestMapping("libros")
public class LibroController {

	private LibroDomain libroDomain;

	@Autowired
	public LibroController(LibroDomain libroDomain) {
		this.libroDomain = libroDomain;
	}

	@GetMapping("/libros")
	public List<LibroEntity> listado() {
		return libroDomain.findAll();
	}

	@GetMapping("/prueba")
	public String metodoPrueba() {
		return "llega al service prueba";

	}

}
