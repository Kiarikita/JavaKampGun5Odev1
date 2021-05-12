package googleValidate;

public class GoogleManager {

	private String googleMailAddress = "izg@gmail.com";
	private String googlePassword = "123456";
	
	
	
	public void login(String mailAddress,String password) {
		
		if(!googleMailAddress.equals(mailAddress)) {
			System.out.println("Girilen google mail adresi yanlýþ!");
		}
		else if(!googlePassword.equals(password)) {
			System.out.println("Girilen google þifresi yanlýþ!");
		}
		else if(!googleMailAddress.equals(mailAddress) && !googlePassword.equals(password)) {
			System.out.println("Girilen google þifresi ve mail adresi yanlýþ!");
		}
		else {
			System.out.println("Kulllanýcý baþarýlý bir þekilde google hesabýyla login oldu.");
		}
		
	}
}
