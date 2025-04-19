package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rupesh Kumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sivasankaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Rupesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.name("description")).sendKeys("This is the Lead position for Computer Department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test1@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1 =  new Select(state);
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//driver.findElement(By.xpath("//input[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an onsite role");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Browser Title is: " +title);
		driver.quit();

	}

}
