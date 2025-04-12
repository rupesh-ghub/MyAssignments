package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rupesh");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		WebElement fieldType1 = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(fieldType1);
		dropdown1.selectByIndex(3);
		WebElement fieldType2 = driver.findElement(By.id("day"));
		Select dropdown2 = new Select(fieldType2);
		dropdown2.selectByValue("4");
		WebElement fieldType3 = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(fieldType3);
		dropdown3.selectByVisibleText("1981");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]/input[@type='radio']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("testleafrupesh@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("TLeaf#2025");
		driver.findElement(By.name("websubmit")).click();
	}

}
