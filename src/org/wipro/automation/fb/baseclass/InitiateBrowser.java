package org.wipro.automation.fb.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.fb.utilitiesClass.ReadPropertiesFile;

public class InitiateBrowser 
{
	
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver(); 
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/msedgedriver.exe");
			driver = new InternetExplorerDriver(); 
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "./Drivers/msedgedriver.exe");
			driver = new OperaDriver(); 
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/msedgedriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		else if(ReadPropertiesFile.readConfig("browser_name").equalsIgnoreCase("Safari"))
		{
			System.setProperty("webdriver.safari.driver", "./Drivers/msedgedriver.exe");
			driver = new SafariDriver(); 
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropertiesFile.readConfig("application_url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
