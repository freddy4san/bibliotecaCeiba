package com.springboot.rest.biblioteca.springboot2restservicebasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="libro")
public class Libro {
	@Id
	@GeneratedValue
	private Long id;
	private String ISBN;
	private boolean prestado;
	
	
	
	public Libro(Long id,String ISBN,boolean prestado) {
		super();
		this.id =id;
		this.ISBN = ISBN;
		this.prestado = prestado;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
}
