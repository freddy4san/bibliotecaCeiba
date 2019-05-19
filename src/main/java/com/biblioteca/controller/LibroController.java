package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.domain.LibroDomain;
import com.biblioteca.entity.LibroEntity;

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
