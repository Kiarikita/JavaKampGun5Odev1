package core.concretes;

import core.abstracts.LoggerService;


public class GoogleManagerAdapter implements LoggerService{
	
	
	public void register(int id, String firstName, String lastName, String email, String password) {
		System.out.println("Google ile kayýt alýndý : " + email);
	}

	
	public void login(String email, String password) {
		System.out.println("Google ile giriþ yapýldý : " + email);
	}
}
