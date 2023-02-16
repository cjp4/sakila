package org.db.service;

import java.util.List;

import org.db.model.Actor;
import org.db.model.Film;

public interface SakilaService {

	List<Film> listFilmByCategory();
	
	List<Actor> listActorByFilmTop10();
	
}
