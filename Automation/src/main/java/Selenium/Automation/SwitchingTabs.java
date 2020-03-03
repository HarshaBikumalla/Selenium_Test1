package Selenium.Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchingTabs extends scrollDown {
	@Test
	public void Test1() throws InterruptedException, AWTException {
		driver.get("https://www.naukri.com/");

		driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Jobs')]")).click();

		Thread.sleep(2000);

		String mainwindow = driver.getWindowHandle();

		driver.switchTo().window(mainwindow);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Companies')]")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			String ChildWindow1 = itr.next();
			String childWindow2 = itr.next();

			driver.switchTo().window(ChildWindow1);
			driver.close();
			driver.switchTo().window(childWindow2);
			driver.close();
			driver.switchTo().window(childWindow);
		}

		/*
		 * ArrayList tabs= new ArrayList(driver.getWindowHandles());
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.switchTo().window((String) tabs.get(0));
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@class='mTxt'][contains(text(),'Companies')]")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.switchTo().window((String) tabs.get(1));
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.switchTo().window((String) tabs.get(1));
		 * 
		 * driver.switchTo().defaultContent(); }
		 * 
		 * private WebElement findElemement(By xpath) { // TODO Auto-generated method
		 * stub return null;
		 * 
		 */
	}

}
