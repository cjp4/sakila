package org.db.repository.impl;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.db.model.film;
import org.db.repository.FilmRepository;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class FilmRepositoryImpl implements FilmRepository{

	@Override
	public List<film> listFilmByCategory() {
		// TODO Auto-generated method stub
  
		List<film> result = new ArrayList<>();
		
		film obj = new film();
		obj.setFilmId(Long.valueOf("1"));
		obj.setDescription("Anabel");
		obj.setTitle("Anabel");
		result.add(obj);
		
		obj = new film();
		obj.setFilmId(Long.valueOf("2"));
		obj.setDescription("Robocot 2");
		obj.setTitle("Robocot 2");
		result.add(obj);
		
		obj = new film();
		obj.setFilmId(Long.valueOf("3"));
		obj.setDescription("Tornado");
		obj.setTitle("Tornado");
		result.add(obj);
		
		obj = new film();
		obj.setFilmId(Long.valueOf("4"));
		obj.setDescription("Armagedon");
		obj.setTitle("Armagedon");
		result.add(obj);
		 
	    return result;
	}

}
