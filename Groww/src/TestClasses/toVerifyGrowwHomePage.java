package TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.HomePage;

public class toVerifyGrowwHomePage {
	WebDriver driver;
	HomePage home;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\New folder\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://groww.in/");

		home=new HomePage(driver);
//		home.clickOnSignInFrame();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		home.clickOnLoginButton();
		Thread.sleep(2000);
		
		home.sendEmailId();
		Thread.sleep(2000);
		
		home.clickOnContinueButton();
		Thread.sleep(2000);
		
		home.sendPassword();
		Thread.sleep(2000);
		
		home.clickOnSubmitButton();
		Thread.sleep(2000);
		
		home.sendPinDigit1();
		Thread.sleep(2000);
		
		home.sendPinDigit2();
		Thread.sleep(2000);
		
		home.sendPinDigit3();
		Thread.sleep(2000);
		
		home.sendPinDigit4();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void verifyInvestmentTab() throws InterruptedException
	{
		home.clickOnInvestmentTab();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if(url.equals("https://groww.in/stocks/user/investments"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		if(title.equals("Dashboard - Groww"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void verifyBalance() throws InterruptedException
	{
		home.clickOnBalanceTab();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if(url.equals("https://groww.in/user/balance/inr"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		if(title.equals("Groww Balance | INR"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		home.clickOnLogOutPre();
		Thread.sleep(2000);
		
		home.clickOnLogOut();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeTheBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	


	
	
	
	
	
	
}
