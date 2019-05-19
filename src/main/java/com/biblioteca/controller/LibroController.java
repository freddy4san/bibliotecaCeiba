package com.biblioteca.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.domain.LibroDomain;
import com.biblioteca.entity.LibroEntity;
import com.biblioteca.repository.LibroRepository;

@RestController
@RequestMapping("libros")
public class LibroController {

	private LibroDomain libroDomain;

	@Autowired
	public LibroController(LibroDomain libroDomain) {
		this.libroDomain = libroDomain;
	}

	@GetMapping("/listaLibros")
	public List<LibroEntity> listado() {
		return libroDomain.findAll();
	}
	
	@PostMapping("/guardarLibros")
	public void guardarLibros(String ISBN, String nombre, Date fechaCreada, Date fechaActualizacion) {
		LibroEntity libroEntity = LibroRepository.findByIsbn(ISBN);
		if(libroEntity == null) {
			libroEntity = new LibroEntity(null, ISBN, false, nombre, null, fechaActualizacion, fechaActualizacion);
			LibroRepository.save(libroEntity);
		}
	}

	@GetMapping("/prueba")
	public String metodoPrueba() {
		return "llega al service prueba";

	}

}
