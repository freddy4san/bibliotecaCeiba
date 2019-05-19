package com.springboot.rest.biblioteca.springboot2restserviceLibroService;
import java.util.List;

import com.springboot.rest.biblioteca.springboot2restservicebasic.*;


public interface libroServicio {
	
	  long save(Libro book);
	  Libro get(long id);
	   List<Libro> list();
	   void update(long id, Libro book);
	   void delete(long id);
}
