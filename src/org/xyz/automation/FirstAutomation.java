package org.xyz.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver(); ///launch your chrome browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.close();
	}
	
	@Test(enabled=false)
	public void loginfunctionality()
	{
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user1");
		
		//driver.findElement(By.name("pass")).sendKeys("pass1234");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(enabled=true)
	public void signupfunctionality() throws Exception
	{
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		//Thread.sleep(2000);  //java waits - fixed wait
		driver.findElement(By.name("firstname")).sendKeys("Java");
		driver.findElement(By.name("websubmit")).click();
		
	}
	
}
