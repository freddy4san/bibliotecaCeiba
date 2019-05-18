package com.springboot.rest.biblioteca.springboot2restservicebasic.services;
import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.LibroPrueba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libroResource {
	
	
	@GetMapping("/libros")
	public List<LibroPrueba> retrieveAllStudents() {
		//return studentRepository.findAll();
		LibroPrueba libro1 = new LibroPrueba((long) 1, "123456", false);
		ArrayList<LibroPrueba> datos = new ArrayList<LibroPrueba>();
		
		datos.add(libro1);
		
		return datos;
	}
	
	@GetMapping("/prueba")
	public String metodoPrueba() {		
		
		return "llega al service prueba";
		
	}
	
}
