package org.db.repository;

import java.util.List;

import org.db.model.Film;

public interface FilmRepository {

	
	List<Film> listFilmByCategory();
}
