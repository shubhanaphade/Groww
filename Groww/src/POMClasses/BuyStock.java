package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyStock {
	
	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Login/Register']")
	private WebElement loginTab;

	@FindBy (xpath="//input[@id='login_email1']")
	private WebElement emailId;
	
	@FindBy (xpath="(//div[@class='absolute-center btn51ParentDimension'])[1]")
	private WebElement continueBut;

	@FindBy (xpath="//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy (xpath="(//div[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")
	private WebElement submitButton;

//	@FindBy (xpath="//div[@class='LgbsSe-bN97Pc']")
//	private WebElement continueButton;
	
	@FindBy (xpath="(//input[@type='number'])[1]")
	private WebElement pinDigit1;
	
	@FindBy (xpath="(//input[@type='number'])[2]")
	private WebElement pinDigit2;
	
	@FindBy (xpath="(//input[@type='number'])[3]")
	private WebElement pinDigit3;
	
	@FindBy (xpath="(//input[@type='number'])[4]")
	private WebElement pinDigit4;
	
	@FindBy (xpath="//input[@id='globalSearch23']")
	private WebElement searchBar;
	
	
	@FindBy (xpath="//div[@class='fs14 fsAuto se27SeSuggestion']")
	private WebElement clickOnSearedCompany;
	
	@FindBy (xpath="//input[@class='qtyinputbox']")
	private WebElement shareQuantity;
	
	@FindBy (xpath="//div[@class='absolute-center btn51ParentDimension']")
	private WebElement buyButton;
	
	@FindBy (xpath="//div[text()='SELL']")
	private WebElement sell;
	
	@FindBy (xpath="//input[@id='inputShare']")
	private WebElement sellShareQuantity;
	
	@FindBy (xpath="//div[@class='absolute-center btn51ParentDimension']")
	private WebElement sellButton;
	
	@FindBy (xpath="(//img[@class='circle'])[1]")
	private WebElement logOutPre;
	
	@FindBy (xpath="//div[text()='Log Out']")
	private WebElement logOut;
	
	public BuyStock(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginButton()
	{
		loginTab.click();
	}
	
	public void sendEmailId()
	{
		emailId.sendKeys("shubhanginaphade9@gmail.com");
	}

	public void clickOnContinueButton()
	{
		continueBut.click();
	}
	
	public void sendPassword()
	{
		password.sendKeys("Svk@1610");
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	
	
	public void sendPinDigit1()
	{
		pinDigit1.sendKeys("6");
	}
	
	public void sendPinDigit2()
	{
		pinDigit2.sendKeys("1");
	}
	
	public void sendPinDigit3()
	{
		pinDigit3.sendKeys("1");
	}

	public void sendPinDigit4()
	{
		pinDigit4.sendKeys("7");
	}
	
	public void sendCompanyToSearch()
	{
		searchBar.sendKeys("Suzlon Energy Ltd.");
	}
	
	public void clickOnCompanyName()
	{
		clickOnSearedCompany.click();
	}
	
	public void SendShareQuantity()
	{
		shareQuantity.sendKeys("1");
	}
	
	public void clickOnBuyButton()
	{
		buyButton.click();
	}
	
	public void ClickOnSellTab()
	{
		sell.click();
	}
	
	public void SendShareQuantitySell()
	{
		sellShareQuantity.click();
	}
	
	public void ClickOnSellButton()
	{
		sellButton.click();
	}
	
	
	
	public void clickOnLogOutPre()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(logOutPre));
		logOutPre.click();
	}
	
	public void clickOnLogOut()
	{
		logOut.click();
	}
	
	
	
}
