package googleValidate;

public class GoogleManager {

	private String googleMailAddress = "izg@gmail.com";
	private String googlePassword = "123456";
	
	
	
	public void login(String mailAddress,String password) {
		
		if(!googleMailAddress.equals(mailAddress)) {
			System.out.println("Girilen google mail adresi yanl��!");
		}
		else if(!googlePassword.equals(password)) {
			System.out.println("Girilen google �ifresi yanl��!");
		}
		else if(!googleMailAddress.equals(mailAddress) && !googlePassword.equals(password)) {
			System.out.println("Girilen google �ifresi ve mail adresi yanl��!");
		}
		else {
			System.out.println("Kulllan�c� ba�ar�l� bir �ekilde google hesab�yla login oldu.");
		}
		
	}
}
