package week3.day2;

public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("Enter Userid and Password");
	}
	
	public void navigateToHomePage()
	{
		System.out.println("Successfully logged in and navigated to Home Page");
	}

	public static void main(String[] args) {
		TestData login = new TestData();
		login.enterCredentials();
		login.navigateToHomePage();

	}

}
