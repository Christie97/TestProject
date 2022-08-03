package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWaitClass;
import utility.GeneralUtilities;

public class ManageProductPage {
	WebDriver driver;
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWaitClass ew= new ExplicitWaitClass();
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProduct;
	
	@FindBy(xpath="//li[text()='List Products']")
	WebElement listProduct;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	
	@FindBy(id="title")
	WebElement titleNew;
	
	@FindBy(name="cat_id")
	WebElement category;
	
	@FindBy(name="sub_id")
	WebElement subCategory;
	
	@FindBy(id="m_weight")
	WebElement weightValue;
	
	@FindBy(id="w_unit")
	WebElement weightUnit;
	
	@FindBy(id="max_weight")
	WebElement maxQuantityCanOrder;
	
	@FindBy(id="w_price")
	WebElement price;
	
	@FindBy(id="w_stock")
	WebElement stockAvailability;
	
	@FindBy(id="main_img")
	WebElement imageAdd;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(name="Search")
	WebElement search2;
	
	@FindBy(name="un")
	WebElement titleSearch;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//td[1]")
	WebElement searchedResult;
	
	@FindBy(xpath="//i[@class='fas fa-trash-alt']")
	WebElement deleteButton;
	
	@FindBy(name="Reset")
	WebElement resetButton;
	
	@FindBy(xpath="(//h4[@class='card-title'])[1]")
	WebElement textReset;
	
	@FindBy(xpath="//span[text()='Last']")
	WebElement last;
	
	
	@FindBy(xpath="(//a[@class='page-link'])[37]")
	WebElement thirtySeven;
	
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickManageProduct()
	{
		gl.clickElement(manageProduct);
	}
	public String ListProductText()
	{
	return	gl.getTextMethod(listProduct);
	}
	public void clickNewButton()
	{
		gl.clickElement(newButton);
	}
	public void enterTitle(String newTitle)
	{
		gl.typeText(titleNew, newTitle);
	}
	public void clickCategoty()
	{
		gl.clickElement(category);
	}
    public void selectCategoryFromDropDown(String categoryfromDropDown)
    {
    	gl.selectFromDropDown(category, categoryfromDropDown);
    }
    public void clickSubCategory()
    {
    	gl.clickElement(subCategory);
    }
    public void selectSubCategoryFromDropDown(String subCategoryfromDropDown)
    {
    	gl.selectFromDropDown(subCategory, subCategoryfromDropDown);
    }
    public void enterWeight(String wt)
    {
    	gl.typeText(weightValue, wt);
    }
    public void selectWeightUnitFromDropDown(String WtUnit)
    {
    	gl.selectFromDropDown(weightUnit, WtUnit);
    }
    public void applyWeightForSubCategory()
    {
    	ew.waitElementToBeClicable(driver,subCategory);
    }
    public void applyWaitOnAlert()
    {
    	ew.waitAlertsPresent(driver);
    }
    public void scrollToStockAvailability() 
	{
		gl.scrollToFindAnElement(driver,stockAvailability);
	}
    public void addsleep() throws InterruptedException
    {
    	gl.addThreadSleep();
    }
    public void maxQtyUserCanOrder(String enterMaxQty)
    {
    	gl.typeText(maxQuantityCanOrder, enterMaxQty);
    }
    public void priceOfItem(String enterPrice)
    {
    	gl.typeText(price, enterPrice);
    }
    public void availableStock(String enterStockAvailable)
    {
    	gl.typeText(stockAvailability, enterStockAvailable);
    }
    public void addimage()
    {
    	gl.scriptExecutorToClick(driver,imageAdd);
    	imageAdd.sendKeys("C:\\Users\\chris\\eclipse-workspace\\com.grocery7MartAppProject\\src\\main\\resources\\laptopimage.jpg");
    }
    public void saveAll()
    {
    	gl.scriptExecutorToClick(driver, saveButton);
    }
    public boolean isAlertMsgDisplayed()
    {
    	return gl.isDisplayedMethod(alert);
    }
    public void clickOnSearch()
    {
    	gl.clickElement(search);
    }
    public void clickOnSearch2()
    {
    	gl.clickElement(search2);
    }
    public void enterTitleNameToSearch(String giveNameToSearch)
    {
    	gl.typeText(titleSearch, giveNameToSearch);
    }
    public boolean isSearchedResultDisplayed()
    {
    	return gl.isDisplayedMethod(searchedResult);
    }
    public void clickOnDelete()
    {
    	gl.clickElement(deleteButton);
    }
    public void scrollToDelete()
    {
    	gl.scriptExecutorToClick(driver, deleteButton);
    }
    public void alertaccept()
    {
    	gl.alertAccept(driver);
    }
    public void clcikOnReset()
    {
    	gl.clickElement(resetButton);
    }
    public boolean isTextResetDisplayed()
    {
    	return gl.isDisplayedMethod(textReset);
    }
    public void clickOnLast()
    {
    	gl.scriptExecutorToClick(driver, last);
    }
    public boolean isLastDisplayed()
    {
    	return gl.isDisplayedMethod(thirtySeven);
    }
    public void scrollToThirtySeven()
    {
    	gl.scrollToFindAnElement(driver, thirtySeven);
    }
}
