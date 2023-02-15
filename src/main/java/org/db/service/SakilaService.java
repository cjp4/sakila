package org.db.service;

import java.util.List;

import org.db.model.actor;
import org.db.model.film;

public interface SakilaService {

	List<film> listFilmByCategory();
	
	List<actor> listActorByFilmTop10();
	
}
