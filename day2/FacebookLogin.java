package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		String expectedtitle = "(1) Facebook";
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleafrupesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TLeaf#2025");
		driver.findElement(By.name("login")).click();
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		System.out.println(Actualtitle.equals(expectedtitle));
	}

}
