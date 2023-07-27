package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseclass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.pages.SignupPage;

public class ValidateSignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_validatesignupfunctionality() throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		
		signup.click_createnewaccount();
		signup.enter_firstname("Selenium");
		signup.enter_lastname("java");
		signup.click_signupbtn();
	}
	
}
