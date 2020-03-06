package Selenium.Automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrollDown
{
	
	WebDriver driver;
	@BeforeTest  
	public void DriverInitialization()
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\browserexefiles\\chromedriver.exe");

		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();

	}
	
	
	@Test
	public void Scroll()
	{ 
		
		driver.get("https://www.softwaretestingmaterial.com/resources/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.xpath("//span[@class='ezmob-footer-close']")).click();
		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * 
		 * js.executeScript("window.scrollBy(0,document.body.scrollheight)");
		 * 
		 * //js.executeScript("0", "3000");
		 * 
		 * //Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath("//span[@class='ezmob-footer-close']")).click();
		 * 
		 * WebElement elepath=driver.findElement(By.
		 * xpath("//span[text()='Manual Testing Tutorial']"));
		 * 
		 * elepath.click();
		 */
	}
	
	@Test
	public void harsha() {
		System.out.println("Method 2");
	}
	
	@Test()
	public void harshab() {
		System.out.println("Method 3");
	}
}

	

	//public static void main(String[] args) throws InterruptedException 
	//{
		

		
		
		
		
		//Create prefs map to store all preferences 
		//Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		//prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		 
		
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
					
		//driver.close(); 

		
		
	//}

	
//}
