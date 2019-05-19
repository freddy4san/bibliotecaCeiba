package com.biblioteca.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.LibroEntity;


@Repository
public interface LibroRepository extends PagingAndSortingRepository<LibroEntity, Long> {

}
