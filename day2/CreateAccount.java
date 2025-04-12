package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Automation");
		WebElement fieldType1 = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(fieldType1);
		dropdown1.selectByValue("IND_SOFTWARE");
		WebElement fieldType2 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(fieldType2);
		dropdown2.selectByVisibleText("S-Corporation");
		WebElement fieldType3 = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(fieldType3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");	
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement fieldType4 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(fieldType4);
		dropdown4.selectByIndex(6);
		WebElement fieldType5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(fieldType5);
		dropdown5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.quit();

	}

}
