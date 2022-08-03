package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelReadClass;
import utility.ExplicitWaitClass;
import utility.GeneralUtilities;

public class VerifyUser {
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWaitClass ew= new ExplicitWaitClass();
	ExcelReadClass erc= new ExcelReadClass();
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-user-check']")
	WebElement verifyUser;
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement userPageText;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(id="un")
	WebElement nameSearch;
	
	@FindBy(name="Search")
	WebElement search2;
	
	@FindBy(xpath="//div[@class='card-body table-responsive p-0']//td[text()='Roshan John					  					  ']")
	WebElement nameText;
	
	@FindBy(id="ph")
	WebElement phoneSearch;
	
	@FindBy(xpath="//div[@class='card-body table-responsive p-0']//td[2]")
	WebElement phoneText;
	
	public VerifyUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickVerifyUser()
	{
		gl.clickElement(verifyUser);
	}
	public boolean isUserPageDisplayed()
	{
		return gl.isDisplayedMethod(userPageText);
	}
	public void clickOnSearch()
	{
		gl.clickElement(search);
	}
	public void enterName(String userName)
	{
		gl.typeText(nameSearch, userName);
	}
	public void clickOnSearch2()
	{
		gl.clickElement(search2);
	}
	public void enterPhone(String phoneNum)
	{
		gl.typeText(phoneSearch, phoneNum);
	}
	public boolean isNameDisplayed()
	{
		return gl.isDisplayedMethod(nameText);
	}
	public boolean isPhoneDisplayed()
	{
		return gl.isDisplayedMethod(phoneText);
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
