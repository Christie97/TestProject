package executeClass;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageExpensePage;
import elementRepository.ManageProductPage;

public class ExecuteManageProduct extends BaseClass
{
LoginPage lp;
ManageProductPage mpp;
  @Test
  public void verifyTheListProductPageIsDisplayedWhileClickingOnManageProduct() 
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 String expectedProductText="List Products";
		String actualProductText=mpp.ListProductText();
		Assert.assertEquals(actualProductText, expectedProductText); 
  }
  @Test
  public void verifyTheUserCanAddANewProductOrNot() throws InterruptedException
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 mpp.clickNewButton();
	mpp.enterTitle("laptop");
	mpp.clickCategoty();
	mpp.selectCategoryFromDropDown("Fruits & Vegetables");
	//mpp.applyWeightForSubCategory();
	mpp.addsleep();
	mpp.clickSubCategory();
	mpp.selectSubCategoryFromDropDown("Fruits");
	mpp.enterWeight("5");
	mpp.selectWeightUnitFromDropDown("kg");
	mpp.maxQtyUserCanOrder("10");
	mpp.priceOfItem("100");
	//mpp.scrollToStockAvailability();
	mpp.availableStock("400");
	mpp.addimage();
	mpp.saveAll();
	boolean actualAlertMsg1 =mpp.isAlertMsgDisplayed();
	 Assert.assertTrue(actualAlertMsg1);
  }
  @Test
  public void verifyTheUserCanSearchAProductByUsingProductName()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 mpp.clickOnSearch();
	 mpp.enterTitleNameToSearch("laptop");
	 mpp.clickOnSearch2();
	 boolean resultsearch =mpp.isSearchedResultDisplayed();
	 Assert.assertTrue(resultsearch);
  }
  
  @Test
  public void verifyTheUserCanDeleteTheCreatedProduct()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 mpp.clickOnSearch();
	 mpp.enterTitleNameToSearch("laptop");
	 mpp.clickOnSearch2();
	 mpp.scrollToDelete();
	 mpp.clickOnDelete();
	 mpp.applyWaitOnAlert();
	 mpp.alertaccept();
	 boolean actualAlertMsg2 =mpp.isAlertMsgDisplayed();
	 Assert.assertTrue(actualAlertMsg2);
  }
  
  @Test
  public void verifyResetButtonWorkingOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 mpp.clickOnSearch();
	 mpp.clickOnSearch2();
	 mpp.clcikOnReset();
	 boolean textThere=mpp.isTextResetDisplayed();
	 Assert.assertFalse(textThere);
  }
  @Test
  public void verifyUserCanNavigateToLastPageyClickingOnlastButton()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mpp=new ManageProductPage(driver);
	 mpp.clickManageProduct();
	 mpp.clickOnLast();
	 mpp.scrollToThirtySeven();
	 boolean lastDisplayed=mpp.isLastDisplayed();
	 Assert.assertTrue(lastDisplayed);
  }
  
  
}
