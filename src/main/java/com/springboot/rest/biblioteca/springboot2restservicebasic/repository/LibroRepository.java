package com.springboot.rest.biblioteca.springboot2restservicebasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.Libro;



@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

}
