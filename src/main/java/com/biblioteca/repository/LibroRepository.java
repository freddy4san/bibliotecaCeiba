package com.biblioteca.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.LibroEntity;


@Repository
public interface LibroRepository extends PagingAndSortingRepository<LibroEntity, Long> {

	static LibroEntity findByIsbn(String ISBN) {
		return null;
	}

	static void saveAndFlush(LibroEntity libroEntity) {
		saveAndFlush(libroEntity);	
	}
	static void delete(LibroEntity libroEntity) {
		delete(libroEntity);	
	}
}
