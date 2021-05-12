package business.abstracts;

import entities.concretes.User;

public interface ValidationService {
	
	boolean validateFirstName(User user);
	boolean validateLastName(User user);
	boolean validateEmail(User user);
	boolean validatePassword(User user);

}
