package Selenium.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TopSecret\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		
		Actions action=new Actions(driver);
		
		WebElement hover=driver.findElement(By.xpath("//span[contains(text(),'DEMO SITES')]"));
		
		action.moveToElement(hover).perform();
		
		WebElement submenu=driver.findElement(By.xpath("//span[contains(text(),'Automation Practice Form')]"));
		
		submenu.click();
		
		
		//entering value in first name text box
				
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harsha");
		
		
		//selecting continents dropdown
		
		WebElement continentsdropdown=driver.findElement(By.xpath("//label[text()='Continents']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",continentsdropdown);
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='continents'][@name='continents']"));
		
		Select continents=new Select(dropdown1);
		
		continents.selectByVisibleText("Africa");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select contimultiselect = new Select(driver.findElement(By.xpath("//select[@id='continentsmultiple'][@class='input-xlarge']")));
		
		contimultiselect.selectByVisibleText("Europe");
		contimultiselect.selectByVisibleText("Africa");
		
		driver.quit();

	}

}
