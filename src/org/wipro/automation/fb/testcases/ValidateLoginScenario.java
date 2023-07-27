package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseclass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.utilitiesClass.CaptureScreen;

public class ValidateLoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validateloginfunctionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_uersname("user1");
		login.enter_password("pass1");
		login.click_loginbtn();
		
		CaptureScreen.takeevidence(driver, "tc01_validateloginfunctionality");
	}
	
	@Test
	public void tc02_validateloginfunctionality() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_uersname("user2");
		login.enter_password("pass2");
		login.click_loginbtn();
		
		CaptureScreen.takeevidence(driver, "tc02_validateloginfunctionality");
	}
}
