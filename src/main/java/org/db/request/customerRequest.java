package org.db.request;
 
import lombok.Data;

@Data
public class customerRequest{
	
	Long storeId;

	String firstName;

	String lastName;

	String email;

}
