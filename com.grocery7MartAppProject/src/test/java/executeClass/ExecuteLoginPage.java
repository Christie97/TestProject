package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;

public class ExecuteLoginPage extends BaseClass{
	
	LoginPage lp;
  @Test
  public void verifyLoginPageIsVisibleWhileLaunchingTheApplication ()
  {
	  lp= new LoginPage(driver);
	  String expectedUrl= "http://groceryapp.uniqassosiates.com/admin/login";
	  //String actualUrl= driver.getCurrentUrl();
	  String actualUrl=lp.getUrlOfLogin();
	  Assert.assertEquals(actualUrl, expectedUrl);
  }
  
  @Test
  public void verifySuccessfulLoginWithValidUsernameAndValidPassword()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin");
	  lp.clickLogin();
	  String expectedUserName="Admin";
	  String actualUserName=lp.adminGetText();
	  Assert.assertEquals(actualUserName, expectedUserName);
  }
  @Test
  public void isRememberMeCheckBoxCheckedOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName("admin");
	  lp.enterPassword("admin"); 
	  boolean remBox=lp.remMeCheckISelected();
	  Assert.assertFalse(remBox);	  
  }
  @Test(dataProvider="dataProvider", dataProviderClass=DataProviderClass.class)
  public void verifyUnsuccessfulLogin(String name,String pass)
  {
	  lp=new LoginPage(driver);
	  lp.enterUserName(name);
	  lp.enterPassword(pass);
	  lp.clickLogin();
	  boolean actualAlertMsg =lp.isAlertMsgDisplayed();
	  Assert.assertTrue(actualAlertMsg);
  }
}
