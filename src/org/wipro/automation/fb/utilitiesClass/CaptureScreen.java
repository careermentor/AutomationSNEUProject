package org.wipro.automation.fb.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreen 
{

	public static void takeevidence(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;  //take screenshot
		
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/"+name+".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
}
