package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWaitClass;
import utility.GeneralUtilities;

public class PushNotificationPage {
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWaitClass ew= new ExplicitWaitClass();
	ExcelReadClass erc= new ExcelReadClass();
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement pushNotification;
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement pushNotificationText;
	
	@FindBy(id="title")
	WebElement enterTitle;
	
	@FindBy(id="description")
	WebElement description;
	
	@FindBy(name="create")
	WebElement send;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
	WebElement resetButton;
	
	public PushNotificationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnPushNotification()
	{
		gl.clickElement(pushNotification);
	}
	public boolean isPushTextDispalyed()
	{
		return gl.isDisplayedMethod(pushNotificationText);
	}
	public void enterTheTitle(String title)
	{
		gl.typeText(enterTitle, title);
	}
	public void enterDescription(String desc)
	{
		gl.typeText(description, desc);
	}
	public void clickOnSend()
	{
		gl.clickElement(send);
	}
	public boolean isAlertDisplayed()
	{
		return gl.isDisplayedMethod(alert);
	}
	public boolean isResetThere()
	{
		return gl.isDisplayedMethod(resetButton);
	}
	public String readUserName(int r, int c) throws IOException
	{
		return erc.readStringData(r, c);
	}
	public String readPassword( int r, int c) throws IOException
	{
		return erc.readStringData(r, c);
	}
}
