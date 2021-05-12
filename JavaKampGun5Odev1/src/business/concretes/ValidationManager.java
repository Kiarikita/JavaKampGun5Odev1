package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.ValidationService;
import entities.concretes.User;

public class ValidationManager implements ValidationService{
	
	@Override
	public boolean validateFirstName(User user) {
		if (user.getFirstName().length() > 2) {
			return true;
		} 
		else {
			System.out.println("Adýnýz iki harften uzun olmak zorunda!");
			return false;
		}
	}

	@Override
	public boolean validateLastName(User user) {
		if (user.getLastName().length() > 2) {
			return true;
		} 
		else {
			System.out.println("Soyadýnýz iki harften uzun olmak zorunda!");
			return false;
		}
	}
	
	String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);


	@Override
	public boolean validateEmail(User user) {
	    Matcher matcher = emailPattern.matcher(user.getEmail());
	    if (matcher.matches()){
	        return true;
	    }
	    else {
	        System.out.println("Geçersiz E-mail!");
	        return false;
	    }
	}
	
	String passwordRegex = "^.{6,}$";
	Pattern passwordPattern = Pattern.compile(passwordRegex);

	@Override
	public boolean validatePassword(User user) {
		Matcher matcher = passwordPattern.matcher(user.getPassword());

		if (matcher.matches()) {
			return true;
		} else {

			System.out.println("Geçersiz Parola! (Parola en az 6 kaakter olmalý)");
		}
		return false;
	}



}
