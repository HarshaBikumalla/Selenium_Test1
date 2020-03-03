package Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementLocators
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\TopSecret\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		//clicking on linktext REGISTER
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		//Sending value in First Name text  box
		
		WebElement FirstName=driver.findElement(By.name("firstName"));
		FirstName.sendKeys("Harsha");
		
		//value into Last Name
		WebElement LastName=driver.findElement(By.name("lastName"));
		LastName.sendKeys("Bikumalla");
		
		//value into Phone
		driver.findElement(By.name("phone")).sendKeys("9505857574");
		
		//value into Email
		driver.findElement(By.id("userName")).sendKeys("b.harsha994@gmail.com");
		
		//value into Address
		driver.findElement(By.name("address1")).sendKeys("xyz");
		
		//City
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		
		//state
		driver.findElement(By.name("state")).sendKeys("Telangana");
		
		//Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("5000081");
		
		
		driver.findElement(By.name("country")).sendKeys("india");
		
		//Country
		Select country=new Select(driver.findElement(By.name("country")));
		

		
		
		
		
		//User Name
		driver.findElement(By.id("email")).sendKeys("abc@1234");
		
		//password
		driver.findElement(By.name("password")).sendKeys("1234asdf");
		
		//Confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("1234asdf");
		
		//clicking submit button
		driver.findElement(By.name("register")).click();
		
		driver.quit();

	}

}
