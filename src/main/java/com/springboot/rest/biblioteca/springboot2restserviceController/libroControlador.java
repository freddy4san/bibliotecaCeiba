package com.springboot.rest.biblioteca.springboot2restserviceController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.rest.biblioteca.springboot2restservicebasic.*;
import com.springboot.rest.biblioteca.springboot2restserviceLibroService.*;
//import com.boraji.tutorial.spring.model.Book;
//import com.boraji.tutorial.spring.service.BookService;

@RestController
public class libroControlador {

	
	@Autowired
	   private libroServicio bookService;

	   /*---nuevo libro---
	   @PostMapping("/book")
	   public ResponseEntity<?> save(@RequestBody Libro book) {
	      long id = bookService.save(book);
	      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	   }*/

	   /*---obtener un libro---*/
	   @GetMapping("/book/{id}")
	   public ResponseEntity<Libro> get(@PathVariable("id") long id) {
		   Libro book = bookService.get(id);
	      return ResponseEntity.ok().body(book);
	   }

	   /*---listar---*/
	   @GetMapping("/book")
	   public ResponseEntity<List<Libro>> list() {
	      List<Libro> books = bookService.list();
	      return ResponseEntity.ok().body(books);
	   }


	   /*---borrar ---
	   @DeleteMapping("/book/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	      bookService.delete(id);
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }*/
	
	   
	

	
}
