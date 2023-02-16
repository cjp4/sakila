package org.db.repository.impl;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.db.model.Actor;
import org.db.repository.ActorRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ActorRepositoryImpl implements ActorRepository{

	@Override
	public List<Actor> listActorByFilmTop10() {
		// TODO Auto-generated method stub
		
		List<Actor> result = new ArrayList<>();
		
		Actor obj = new Actor();
		obj.setActorId(Long.valueOf("12"));
		obj.setFirstName("carlos");
		obj.setLastName("Jorge");
		result.add(obj);
		
		obj = new Actor();
		obj.setActorId(Long.valueOf("13"));
		obj.setFirstName("pedro");
		obj.setLastName("almued");
		result.add(obj);
		
		obj = new Actor();
		obj.setActorId(Long.valueOf("14"));
		obj.setFirstName("fernando");
		obj.setLastName("perez");
		result.add(obj);
		
		obj = new Actor();
		obj.setActorId(Long.valueOf("15"));
		obj.setFirstName("frank");
		obj.setLastName("Bledas");
		result.add(obj);

	    return result;
	}

}
