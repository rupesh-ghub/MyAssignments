package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("747");
		driver.findElement(By.name("phoneNumber")).sendKeys("1122334");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.partialLinkText("Rupesh")).click();
		driver.findElement(By.linkText("Delete")).click();
	}

}
