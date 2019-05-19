package com.springboot.rest.biblioteca.springboot2restservicebasic;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="Prestamo")
public class PrestamoEntity {
	@Id
	@GeneratedValue
	private int id;
	private int idpersona;
	private Date FechaPrestamo;
	private Date FechaEntrega;
	
	public PrestamoEntity(int id, int idpersona, Date FechaPrestamo, Date FechaEntrega) {
		super();
		this.id=id;
		this.idpersona=idpersona;
		this.FechaPrestamo=FechaPrestamo;
		this.FechaEntrega =FechaEntrega;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public Date getFechaPrestamo() {
		return FechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		FechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntrega() {
		return FechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	
	

}
