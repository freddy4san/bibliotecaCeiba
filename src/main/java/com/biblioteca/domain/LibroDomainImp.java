package com.biblioteca.domain;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.LibroEntity;
import com.biblioteca.repository.LibroRepository;



@Service
public class LibroDomainImp  implements LibroDomain{
	
	private LibroRepository libroRepository;
	
	@Autowired
	public LibroDomainImp(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}

	@Override
	public List<LibroEntity> findAll() {
		return (List<LibroEntity>) libroRepository.findAll();
	}
}
