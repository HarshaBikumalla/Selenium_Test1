package Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datePicker
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/TopSecret/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	
		
		WebDriverWait wait = new  WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept Cookies']")));
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
		
		if(element.isDisplayed())
		{
			element.click();
			Thread.sleep(2000);
		}
		
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='November 2019']")));
		
		driver.findElement(By.xpath("//a[text()='November 2019']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Jan']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Tuesday, January 01, 2019']")).click();
		
		
		//setting the time
		
		driver.findElement(By.xpath("//span[@aria-label='Open the time view']")).click();
		
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement((By.xpath("//li[text()='9:30 PM']")));
		ele1.click();
		
//		Thread.sleep(2000);
//		
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
//		
//		ele1.click();

	}

}
