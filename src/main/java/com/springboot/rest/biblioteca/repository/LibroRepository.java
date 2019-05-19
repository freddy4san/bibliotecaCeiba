package com.springboot.rest.biblioteca.springboot2restservicebasic.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.biblioteca.springboot2restservicebasic.entity.LibroEntity;

@Repository
public interface LibroRepository extends PagingAndSortingRepository<LibroEntity, Long> {

}
