package elementRepository;

import org.apache.commons.math3.analysis.function.Log10;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class LoginPage {
	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();

	@FindBy(xpath="(//input[@class=\"form-control\"])[1]")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//button[text()='Sign In']")
	WebElement loginButton;

	@FindBy(id="remember")
	WebElement rememberCheckBox;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertMsg;

	@FindBy(xpath="(//a[@class=\"nav-link\"])[2]")
	WebElement admin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String uName)
	{
		gl.typeText(userName, uName);
	}
	public void enterPassword(String psw)
	{
		gl.typeText(password, psw);
	}
	public void clickLogin()
	{
		gl.clickElement(loginButton);
	}
	public boolean remMeCheckISelected()
	{
		return gl.isSelectedMethod(rememberCheckBox);
	}
	public String getUrlOfLogin()
	{
		return driver.getCurrentUrl();
	}
	public boolean isAlertMsgDisplayed()
	{
		return gl.isDisplayedMethod(alertMsg);
	}
	public String adminGetText()
	{
		return gl.getTextMethod(admin);
	}
	
	
}
