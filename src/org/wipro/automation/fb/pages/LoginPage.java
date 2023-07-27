package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.ReadPropertiesFile;

public class LoginPage 
{

	WebDriver driver; //global driver
	
	public LoginPage(WebDriver driver)   //local variable
	{
		this.driver=driver;
	}

	public void enter_uersname(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropertiesFile.readElement("login_username_id"))).sendKeys(uname);
		
	}
	
	public void enter_password(String upass) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("login_password_name"))).sendKeys(upass);
		
	}
	
	public void click_loginbtn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesFile.readElement("login_loginbttn_css"))).click();
		
	}
}
