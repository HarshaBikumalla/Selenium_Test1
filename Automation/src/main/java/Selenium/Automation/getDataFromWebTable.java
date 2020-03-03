package Selenium.Automation;

import java.util.List;

import javax.sound.sampled.Line;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataFromWebTable
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/TopSecret/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
		
		List<WebElement> table=driver.findElements(By.xpath("//tbody/tr"));
		
		for(WebElement elemements : table)
		{
			String data = elemements.getText();
			System.out.println(data);	
		}
		

	}

}
