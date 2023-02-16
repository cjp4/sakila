package org.db.controller;

import java.util.List;

import org.db.model.Actor;
import org.db.model.Film;
import org.db.service.SakilaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sakila")
@RequiredArgsConstructor
public class SakilaController {
		
	private final SakilaService sakilaService;
	
	@GetMapping("/peliculas")
	public List<Film> listar(){
		return sakilaService.listFilmByCategory();
	}

	@GetMapping("/listActorByFilmTop10")
	public List<Actor> listActorByFilmTop10(){
		return sakilaService.listActorByFilmTop10();
	}
	
}
