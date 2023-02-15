package org.db.repository;

import java.util.List;

import org.db.model.film;

public interface FilmRepository {

	
	List<film> listFilmByCategory();
}
