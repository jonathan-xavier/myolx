package com.jhon.myolx.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhon.myolx.domain.Categoria;
import com.jhon.myolx.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj;
	}
}
