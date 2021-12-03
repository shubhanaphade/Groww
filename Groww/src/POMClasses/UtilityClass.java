package POMClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	WebDriver driver;
	public void TakeScreenshot(WebDriver driver) throws IOException
	{
		this.driver=driver;
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\TakeScreenshot\\FirstScreenshot.jpg");
		FileHandler.copy(scr, dest);
		
		System.out.println("Screenshot Taken Successfully...");
	}
	
	
}

