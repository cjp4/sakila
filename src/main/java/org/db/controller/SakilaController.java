package org.db.controller;

import java.util.List;

import org.db.model.actor;
import org.db.model.film;
import org.db.service.SakilaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sakila")
@RequiredArgsConstructor
public class SakilaController {
		
	private final SakilaService sakilaService;
	
	@GetMapping("/peliculas")
	public List<film> listar(){
		return sakilaService.listFilmByCategory();
	}

	@GetMapping("/listActorByFilmTop10")
	public List<actor> listActorByFilmTop10(){
		return sakilaService.listActorByFilmTop10();
	}
	
}
