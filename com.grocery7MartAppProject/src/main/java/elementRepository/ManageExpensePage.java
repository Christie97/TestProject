package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class ManageExpensePage {
	
WebDriver driver;
GeneralUtilities gl=new GeneralUtilities();

@FindBy(xpath="(//a[@class='nav-link'])[3]")
WebElement manageExpense;

@FindBy(xpath="(//i[@class='far fa-circle nav-icon'])[1]")
WebElement expenseCategory;

@FindBy(xpath="//li[@class='breadcrumb-item active']")
WebElement expenseCategoryText;

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement newButton;

@FindBy(name="name")
WebElement title;

@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[2]")
WebElement saveButton;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement alert;

@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
WebElement searchButton;

@FindBy(id="un")
WebElement titleSearch;

@FindBy(name="Search")
WebElement searchButton2;

@FindBy(xpath="(//i[@class='fas fa-edit'])[2]")
WebElement edit;

@FindBy(id="((//input[@class='form-control'])[2]")
WebElement titleEdit;

@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")
WebElement updateEdit;

@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]")
WebElement delete;

@FindBy(xpath="//*[contains(text(), ' mobile   ')]")
WebElement titleName;

public ManageExpensePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickExpenseCategory()
{
	gl.clickElement(expenseCategory);
}
public void clickManageexpense()
{
	gl.clickElement(manageExpense);
}
public void clickNewButton()
{
	gl.clickElement(newButton);
}
public void clickSaveButton()
{
	gl.clickElement(saveButton);
}
public boolean isAlertMsgDisplayed()
{
	return gl.isDisplayedMethod(alert);
}
public void clickSearchButton()
{
	gl.clickElement(searchButton);
}
public void entertitleSearch(String title)
{
	gl.typeText(titleSearch, title);
}
public boolean isSearchedTitleDisplayed()
{
	return gl.isDisplayedMethod(titleName);
}
public void clickSearchButton2()
{
	gl.clickElement(searchButton2);
}
public void clickEditbutton()
{
	gl.clickElement(edit);
}
public void entertitleEdit(String titleEdit)
{
	gl.typeText(title, titleEdit);
}
public void clickUpdateButton()
{
	gl.clickElement(updateEdit);
}
public void clickDeleteButton()
{
	gl.clickElement(delete);
}
public String expenseCategoryGetText()
{
	return gl.getTextMethod(expenseCategoryText);
}
public void enterTitle(String inputTitle)
{
gl.typeText(title,inputTitle);
}
public void alertaccept()
{
	gl.alertAccept(driver);
}
}