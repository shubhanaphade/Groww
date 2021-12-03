package TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.BuyStock;



public class ToVerifyBuy {
	
	WebDriver driver;
	BuyStock buy;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://groww.in/");

		buy=new BuyStock(driver);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		buy.clickOnLoginButton();
		Thread.sleep(2000);
		
		buy.sendEmailId();
		Thread.sleep(2000);
		
		buy.clickOnContinueButton();
		Thread.sleep(2000);
		
		buy.sendPassword();
		Thread.sleep(2000);
		
		buy.clickOnSubmitButton();
		Thread.sleep(2000);
		
		buy.sendPinDigit1();
		Thread.sleep(2000);
		
		buy.sendPinDigit2();
		Thread.sleep(2000);
		
		buy.sendPinDigit3();
		Thread.sleep(2000);
		
		buy.sendPinDigit4();
		Thread.sleep(2000);
		
	}

//	@Test
//	public void verifyBuy() throws InterruptedException
//	{
//		buy.sendCompanyToSearch();
//		Thread.sleep(2000);
//	
//		buy.clickOnCompanyName();
//		Thread.sleep(2000);
//		
//		buy.SendShareQuantity();
//		Thread.sleep(2000);
//		
//		buy.clickOnBuyButton();
//		Thread.sleep(2000);
//		
//	}
	
	@Test
	public void verifyBuy() throws InterruptedException
	{
		buy.sendCompanyToSearch();
		Thread.sleep(2000);
		
		buy.clickOnCompanyName();
		Thread.sleep(2000);
	
	}
	
	@Test(priority=1)
	public void verifySell() throws InterruptedException
	{
		buy.ClickOnSellTab();
		Thread.sleep(2000);
		
		buy.SendShareQuantitySell();
		Thread.sleep(2000);
		
		buy.ClickOnSellButton();
		Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		buy.clickOnLogOutPre();
		Thread.sleep(2000);
		
		buy.clickOnLogOut();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeTheBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}
