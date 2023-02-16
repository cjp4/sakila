package org.db.repository;

import java.util.List;

import org.db.model.Actor;

public interface ActorRepository {

	 List<Actor> listActorByFilmTop10();
}
