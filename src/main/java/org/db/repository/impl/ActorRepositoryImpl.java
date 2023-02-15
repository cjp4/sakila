package org.db.repository.impl;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.db.model.actor;
import org.db.repository.ActorRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ActorRepositoryImpl implements ActorRepository{

	@Override
	public List<actor> listActorByFilmTop10() {
		// TODO Auto-generated method stub
		
		List<actor> result = new ArrayList<>();
		
		actor obj = new actor();
		obj.setActorId(Long.valueOf("12"));
		obj.setFirstName("carlos");
		obj.setLastName("Jorge");
		result.add(obj);
		
		obj = new actor();
		obj.setActorId(Long.valueOf("13"));
		obj.setFirstName("pedro");
		obj.setLastName("almued");
		result.add(obj);
		
		obj = new actor();
		obj.setActorId(Long.valueOf("14"));
		obj.setFirstName("fernando");
		obj.setLastName("perez");
		result.add(obj);
		
		obj = new actor();
		obj.setActorId(Long.valueOf("15"));
		obj.setFirstName("frank");
		obj.setLastName("Bledas");
		result.add(obj);

	    return result;
	}

}
