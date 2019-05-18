package com.springboot.rest.biblioteca.springboot2restservicebasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue
    private Long id;
    private String ISBN;
    private Long cantidadT;

    public Inventario(String ISBN, Long cantidadT) {
        this.ISBN = ISBN;
        this.cantidadT = cantidadT;
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

    public Long getCantidadT() {
        return cantidadT;
    }

    public void setCantidadT(Long cantidadT) {
        this.cantidadT = cantidadT;
    }
}
