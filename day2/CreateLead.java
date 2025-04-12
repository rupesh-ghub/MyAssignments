package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		String expectedTitle = "Test Lead";
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rupesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivasankaran");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement acuTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
		String actualTitle = acuTitle.getText();
		System.out.println(expectedTitle.equals(actualTitle));
		driver.quit();
	}

}
