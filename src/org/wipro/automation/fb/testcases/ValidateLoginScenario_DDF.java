package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseclass.InitiateBrowser;
import org.wipro.automation.fb.datagenerators.TestDataGenerator;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.utilitiesClass.CaptureScreen;

public class ValidateLoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="data",dataProviderClass=TestDataGenerator.class)
	public void tc01_validateloginfunctionality(String uname, String pass) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_uersname(uname);
		login.enter_password(pass);
		login.click_loginbtn();
		
		CaptureScreen.takeevidence(driver, "tc01_validateloginfunctionality");
	}
	
		
}
