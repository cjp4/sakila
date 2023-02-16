package org.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.db.model.Actor;
import org.db.model.Film;
import org.db.service.impl.SakilaServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SakilaServiceImplTest {

  SakilaServiceImpl service;
	
	
  private void initMock() {
    service = mock(SakilaServiceImpl.class);
  }
	  
	  
  @Test
  @DisplayName("test1_listFilmByCategory")
  public void test1_listFilmByCategory() {
		  
    initMock();	 
    
    List<Film> result = service.listFilmByCategory();
    assertNotNull(result);
    
  }
  
  @Test
  @DisplayName("test2_listActorByFilmTop10")
  public void test2_listActorByFilmTop10() {
		  
    initMock();	 
    
    List<Actor> result = service.listActorByFilmTop10();
    assertNotNull(result);
    
  }
	  
}
