package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class ManageOrderPage {

	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-shopping-basket']")
	WebElement manageOrder;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(id="od")
	WebElement orderId;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
	WebElement search2;  
	
	@FindBy(xpath="//a[@class='btn btn-block btn-outline-info btn-sm']")
	WebElement view;
	
	@FindBy(xpath="//li[@class='breadcrumb-item active']")
	WebElement orderDetailsText;
	
	@FindBy(xpath="(//h4[@class='card-title'])[2]")
	WebElement listOrder;
	
	public ManageOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickManageOrder()
	{
		gl.clickElement(manageOrder);
	}
	
	public void clickSearch()
	{
		gl.clickElement(search);
	}
	
	public void clickOrderId()
	{
		gl.clickElement(orderId);
	}
	
	public void enterOrderId(String enterOrderId)
	{
		gl.typeText(orderId, enterOrderId);
	}
	
	public void scrollToSearch2() 
	{
		gl.scrollToFindAnElement(driver, search2);
	}
	
	public void clickSearch2()
	{
		gl.clickElement(search2);
	}
	
	public void clickView()
	{
		gl.clickElement(view);
	}
	
	public String orderDetailsGetText()
	{
		return gl.getTextMethod(orderDetailsText);
	}
	
	public boolean isListOrderTextDisplayed()
	{
		return gl.isDisplayedMethod(listOrder);
	}
	public void scrollToView() 
	{
		gl.scrollToFindAnElement(driver,view);
	}
	public void clickOnViewButton() 
	{
		gl.scriptExecutorToClick(driver, view);
	}
}
