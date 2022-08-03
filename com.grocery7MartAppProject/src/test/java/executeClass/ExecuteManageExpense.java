package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageExpensePage;

public class ExecuteManageExpense extends BaseClass
{
	LoginPage lp;
	ManageExpensePage mp;
  @Test(priority=1)
  
  public void  verifytheListPagesVisibleWhileClickingOnExpenseCategoryUnderManageExpense() {
	 lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mp=new ManageExpensePage(driver);
	 mp.clickManageexpense();
	 mp.clickExpenseCategory();
	String expectedExpenseCategoryName="Expense Category";
	String actualExpenseCategoryName=mp.expenseCategoryGetText();
	Assert.assertEquals(actualExpenseCategoryName, expectedExpenseCategoryName);
  }
  @	Test(priority=2)
  
  public void verifyTheAdminCanCreateANewExpenceCategory()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mp=new ManageExpensePage(driver);
	 mp.clickManageexpense();
	 mp.clickExpenseCategory();
	 mp.clickNewButton();
	 mp.enterTitle("mobile");
	 mp.clickSaveButton();
	 boolean actualAlertMsg =mp.isAlertMsgDisplayed();
	  Assert.assertTrue(actualAlertMsg);	 
  }
  @Test(priority=3)
  public void verifyTheAdminCanSearchTheNewlyCreatedExpenceCategory()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mp=new ManageExpensePage(driver);
	 mp.clickManageexpense();
	 mp.clickExpenseCategory();
	 mp.clickSearchButton();
	 mp.entertitleSearch("mobile");
	 mp.clickSearchButton2();
	 boolean mobileDisplayed=mp.isSearchedTitleDisplayed();
	 Assert.assertTrue(mobileDisplayed);
  }
  @Test(priority=4)
  public void verifyTheAdminCanEditTheCreatedOne()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mp=new ManageExpensePage(driver);
	 mp.clickManageexpense();
	 mp.clickExpenseCategory();
	 mp.clickSearchButton();
	 mp.entertitleSearch("mobile");
	 mp.clickEditbutton();
	 mp.entertitleEdit("1");
	 mp.clickUpdateButton();
	 boolean actualAlertMsg1 =mp.isAlertMsgDisplayed();
	 Assert.assertTrue(actualAlertMsg1);
  }
  @Test(priority=5)
  public void verifyTheAdminCanDeleteTheCreatedOne()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mp=new ManageExpensePage(driver);
	 mp.clickManageexpense();
	 mp.clickExpenseCategory();
	 mp.clickSearchButton();
	 mp.entertitleSearch("mobile1");
	 mp.clickDeleteButton();
	 mp.alertaccept();
	 boolean actualAlertMsg2 =mp.isAlertMsgDisplayed();
	 Assert.assertTrue(actualAlertMsg2);
  }
  
  
  
}
