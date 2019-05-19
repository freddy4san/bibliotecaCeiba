package com.springboot.rest.biblioteca.springboot2restservicebasic.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.Libro;
import com.springboot.rest.biblioteca.springboot2restservicebasic.repository.LibroRepository;

@RestController
public class LibroResource {
	
	@Autowired
	private LibroRepository libroRepository;
	
	
	@GetMapping("/libros")
	public List<Libro> retrieveAllStudents() {
		return libroRepository.findAll();
	}
	
	@GetMapping("/prueba")
	public String metodoPrueba() {		
		
		return "llega al service prueba";
		
	}
	
}
