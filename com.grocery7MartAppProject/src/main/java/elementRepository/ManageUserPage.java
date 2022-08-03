package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWaitClass;
import utility.GeneralUtilities;

public class ManageUserPage {
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWaitClass ew= new ExplicitWaitClass();
	ExcelReadClass erc= new ExcelReadClass();
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-user']")
	WebElement manageUser;
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement manageUserText;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(id="un")
	WebElement searchName;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//td[1]")
	WebElement searchNameText;
	
	@FindBy(name="Search")
	WebElement search2;
	
	@FindBy(id="ut")
	WebElement searchEmail;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//td[2]")
	WebElement searchEmailText;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-danger btn-rounded']")
	WebElement status;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMsg;
	
	public ManageUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickManageUser()
	{
		gl.clickElement(manageUser);
	}
	public boolean isManageUserTextDisplayed()
	{
		return gl.isDisplayedMethod(manageUserText);
	}
	public void clickSearch()
	{
		gl.clickElement(search);
	}
	public void enterName(String uName)
	{
		gl.typeText(searchName, uName);
	}
	public boolean isNameTextDisplayed()
	{
		return gl.isDisplayedMethod(searchNameText);
	}
	public void clickSearch2()
	{
		gl.clickElement(search2);
	}
	public void enterEmail(String email)
	{
		gl.typeText(searchEmail, email);
	}
	public boolean isEmailDisplayed()
	{
		return gl.isDisplayedMethod(searchEmailText);
	}
	public String readUserName(int r, int c) throws IOException
	{
		return erc.readStringData(r, c);
	}
	public String readPassword( int r, int c) throws IOException
	{
		return erc.readStringData(r, c);
	}
	public void clickOnStatus()
	{
		gl.scriptExecutorToClick(driver,status);
	}
	public boolean isAlertDisplayed()
	{
		return gl.isDisplayedMethod(alertMsg);
	}
}
