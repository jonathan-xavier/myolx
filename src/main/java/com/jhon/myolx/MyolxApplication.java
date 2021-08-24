package com.jhon.myolx;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jhon.myolx.domain.Categoria;
import com.jhon.myolx.repositories.CategoriaRepository;

@SpringBootApplication
public class MyolxApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MyolxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repository.saveAll(Arrays.asList(cat1,cat2));
		
		
	}

}
