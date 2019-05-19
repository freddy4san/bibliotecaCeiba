package com.springboot.rest.biblioteca.springboot2restservicebasic.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.Libro;
import com.springboot.rest.biblioteca.springboot2restservicebasic.exception.LibroNotFoundException;
import com.springboot.rest.biblioteca.springboot2restservicebasic.repository.LibroRepository;

@RestController
public class LibroResource {
	
	@Autowired
	private LibroRepository libroRepository;
	
	
	@GetMapping("/libros")
	public List<Libro> retrieveAllStudents() {
		return libroRepository.findAll();
	}
	
	@GetMapping("/libros/{id}")
	public Libro consultarLibro(@PathVariable long id) {
		Optional<Libro> student = libroRepository.findById(id);

		if (!student.isPresent())
			throw new LibroNotFoundException("id-" + id);

		return student.get();
	}
	
	@DeleteMapping("/libros/{id}")
	public  void eliminarLibro(@PathVariable long id) {
		libroRepository.deleteById(id);
	}
	
	@GetMapping("/prueba")
	public String metodoPrueba() {		
		
		return "llega al service prueba";
		
	}
	
}
