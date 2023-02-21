package org.db.service.impl;

import java.util.List;
import org.db.model.Actor;
import org.db.model.Film;
import org.db.repository.ActorRepository;
import org.db.repository.FilmRepository;
import org.db.service.SakilaService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SakilaServiceImpl implements SakilaService{

	private final FilmRepository filmRepo;
	
	private final ActorRepository actorRepo;
	
	@Override
	public List<Film> listFilmByCategory() {
		return filmRepo.listFilmByCategory();
	}

	@Override
	public List<Actor> listActorByFilmTop10() {
		return actorRepo.listActorByFilmTop10();
	}

}
