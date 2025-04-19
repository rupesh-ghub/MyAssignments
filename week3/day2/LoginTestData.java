package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("User1");
		
	}
	
	public void enterPassword()
	{
		System.out.println("Pa$$word");
	}

	public static void main(String[] args) {
		LoginTestData credentials = new LoginTestData();
		credentials.enterCredentials();
		credentials.enterUsername();
		credentials.enterPassword();
		credentials.navigateToHomePage();

	}

}
