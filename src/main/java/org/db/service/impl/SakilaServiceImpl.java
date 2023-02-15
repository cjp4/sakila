package org.db.service.impl;

import java.util.List;
import org.db.model.actor;
import org.db.model.film;
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
	public List<film> listFilmByCategory() {
		// TODO Auto-generated method stub
		return filmRepo.listFilmByCategory();
	}

	@Override
	public List<actor> listActorByFilmTop10() {
		// TODO Auto-generated method stub
		return actorRepo.listActorByFilmTop10();
	}

}
