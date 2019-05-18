package com.springboot.rest.biblioteca.springboot2restservicebasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "libro")
public class Libro {
    @Id
    @GeneratedValue
    private Long id;
    private String ISBN;
    private boolean prestado;
    private String nombre;
    private Long ejemplar;
    private Date fechaCreada;
    private Date fechaActualizada;


    public Libro(Long id, String ISBN, boolean prestado, String nombre, Long ejemplar, Date fechaCreada, Date fechaActualizada) {
        super();
        this.id = id;
        this.ISBN = ISBN;
        this.prestado = prestado;
        this.nombre = nombre;
        this.ejemplar = ejemplar;
        this.fechaCreada = fechaCreada;
        this.fechaActualizada = fechaActualizada;
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

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Long ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Date getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public Date getFechaActualizada() {
        return fechaActualizada;
    }

    public void setFechaActualizada(Date fechaActualizada) {
        this.fechaActualizada = fechaActualizada;
    }
}
