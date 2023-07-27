package org.wipro.automation.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="data")
	public Object[][] testdatagen()
	{
		
		
		Object[][] testdata = {{"User1","pass1"},{"User2","pass2"},{"User3","pass3"}};  //2-dimensional array
		return testdata;
	}
	

	
}
