package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageExpensePage;
import elementRepository.ManageOrderPage;

public class ExecuteManageOrder extends BaseClass{
	LoginPage lp;
	ManageOrderPage mop;
  @Test
  
  public void verifyTheAdminCanSearchAnOrderByUsingOrderId() {
	 lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mop=new ManageOrderPage(driver);
	  mop.clickManageOrder();
	  mop.clickSearch();
	  mop.clickOrderId();
	  mop.enterOrderId("650");
	  mop.scrollToSearch2();
	  mop.clickSearch2();
	 boolean listOrderText=mop.isListOrderTextDisplayed();
	 Assert.assertTrue(listOrderText);
  }
  @Test
  public void verifyTheAdminCanViewTheOrderDetailsOfSearchedOrder(){
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	 mop=new ManageOrderPage(driver);
	  mop.clickManageOrder();
	  mop.clickSearch();
	  mop.clickOrderId();
	  mop.enterOrderId("650");
	  mop.scrollToSearch2();
	  mop.clickSearch2();
	  mop.scrollToView();
	  mop.clickOnViewButton();
	  String expectedViewPage="Order Details";
	  String actualViewPage=mop.orderDetailsGetText();
	  Assert.assertEquals(actualViewPage, expectedViewPage);
	 
  }
}
  
  
  
