package week2.day1;

public class Browser {
		
	public String launchBrowser(String browserName)
	{
		System.out.println(browserName + " Yay...");
		return browserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser urlTest = new Browser();
		urlTest.launchBrowser("Browser Launched Successfully");
		urlTest.loadUrl();

	}

}
