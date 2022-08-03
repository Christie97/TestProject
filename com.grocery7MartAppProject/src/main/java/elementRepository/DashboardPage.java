package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.GeneralUtilities;

public class DashboardPage {

	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();
	ExcelReadClass erc= new ExcelReadClass();
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement dashboardText;
	
	@FindBy(xpath="(//*[text()='Manage Pages'])[2]")
	WebElement managePage;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]")
	WebElement moreInfoManagepage;
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement listpageText;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean dashboardTextDispalyed()
	{
		return gl.isDisplayedMethod(dashboardText);
	}
	public String managePageGetText()
	{
		return gl.getTextMethod(managePage);
	}
	public void ClickmoreInfo()
	{
		gl.clickElement(moreInfoManagepage);
	}
	public boolean islistPageTextDisplayed()
	{
		return gl.isDisplayedMethod(listpageText);
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
