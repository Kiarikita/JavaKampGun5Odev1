package core.abstracts;

public interface LoggerService {
	
	void register(int id, String firstName, String lastName, String email, String password);

	void login(String email, String password);

}
