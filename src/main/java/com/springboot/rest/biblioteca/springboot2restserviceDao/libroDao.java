package com.springboot.rest.biblioteca.springboot2restserviceDao;

import com.springboot.rest.biblioteca.springboot2restservicebasic.*;
import java.util.List;

public interface libroDao {

	 long save(Libro book);
	 Libro get(long id);
	   List<Libro> list();
	   void update(long id, Libro book);
	   void delete(long id);
	   
}
