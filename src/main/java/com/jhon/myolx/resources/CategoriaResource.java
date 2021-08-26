package com.jhon.myolx.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhon.myolx.domain.Categoria;
import com.jhon.myolx.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		
		Optional<Categoria> obj = Optional.ofNullable(service.buscar(id));
		
		return ResponseEntity.ok(obj);
		
	
	}
}
