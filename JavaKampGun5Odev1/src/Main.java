
import business.concretes.ValidationManager;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Zülal");
		user1.setLastName("Güner");
		user1.setEmail("izg@java.com");
	    user1.setPassword("12345");
	    
		
		
		ValidationManager validationManager = new ValidationManager();
		validationManager.validateFirstName(user1);
		validationManager.validateLastName(user1);
		validationManager.validateEmail(user1);
		validationManager.validatePassword(user1);
		
		
	}

}
