package Selenium.Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/TopSecret/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js=(JavascriptExecutor)  driver;
		
		// js.executeScript("window.scrollBy(0,2000)");
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Linux']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele1);
		
		ele1.click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		
		try
		{
			FileUtils.copyFile(src, new File(src, null));
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		 
		
		

	}

}
