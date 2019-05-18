package com.springboot.rest.biblioteca.springboot2restservicebasic.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.biblioteca.springboot2restservicebasic.Libro;

@RestController
public class libroResource {
	
	
	@GetMapping("/libros")
	public List<Libro> retrieveAllStudents() {
		//return studentRepository.findAll();
		Libro libro1 = new Libro((long) 1, "123456", false);
		ArrayList<Libro> datos = new ArrayList<Libro>();
		datos.add(libro1);
		return datos;
	}
	
	@GetMapping("/prueba")
	public String metodoPrueba() {		
		
		return "llega al service prueba";
		
	}
	
}
