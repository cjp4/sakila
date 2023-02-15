package org.db.request;

import lombok.Data;

@Data
public class customerUpdateRequest {

	Long customerId;
	
	String firstName;

	String lastName;

	String email;
}
