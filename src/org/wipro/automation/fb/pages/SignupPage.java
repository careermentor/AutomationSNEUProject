package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.ReadPropertiesFile;

public class SignupPage 
{

	WebDriver driver; //global driver
	
	public SignupPage(WebDriver driver)   //local variable
	{
		this.driver=driver;
	}

	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFile.readElement("signup_createnewaccount_xpath"))).click();
		
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_firstname_name"))).sendKeys(fname);
		
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_lastname_name"))).sendKeys(lname);
		
	}
	
	public void click_signupbtn() throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFile.readElement("signup_bttn_signup_name"))).click();
		
	}
}
