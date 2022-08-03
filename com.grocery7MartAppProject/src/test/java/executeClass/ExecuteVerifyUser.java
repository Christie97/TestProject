package executeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import elementRepository.LoginPage;
import elementRepository.VerifyUser;

public class ExecuteVerifyUser extends BaseClass{
	LoginPage lp;
	VerifyUser vu;
  @Test
  public void verifyTheListUsersPageIsDisplayedWhileClickingOnVerifyUsers() throws IOException {
	  lp=new LoginPage(driver);
		vu=new VerifyUser(driver);
		  lp.enterUserName(vu.readUserName(0, 1));
		  lp.enterPassword(vu.readPassword(1, 1));
		  lp.clickLogin();
		  vu.clickVerifyUser();
		  boolean isUserText=vu.isUserPageDisplayed();
		  Assert.assertTrue(isUserText);
		  
  }
  @Test
  public void VerifyTheUserCanSearchAUserByUsingName() throws IOException
  {
	  lp=new LoginPage(driver);
		vu=new VerifyUser(driver);
		  lp.enterUserName(vu.readUserName(0, 1));
		  lp.enterPassword(vu.readPassword(1, 1));
		  lp.clickLogin();
		  vu.clickVerifyUser();
		  vu.clickOnSearch();
		  vu.enterName("roshan");
		  vu.clickOnSearch2();
		  boolean isNameSearch=vu.isNameDisplayed();
		  Assert.assertTrue(isNameSearch);
  }
  @Test
  public void VerifyTheUserCanSearchAUserByUsingPhoneNumber() throws IOException
  {
	  lp=new LoginPage(driver);
		vu=new VerifyUser(driver);
		  lp.enterUserName(vu.readUserName(0, 1));
		  lp.enterPassword(vu.readPassword(1, 1));
		  lp.clickLogin();
		  vu.clickVerifyUser();
		  vu.clickOnSearch();
		  vu.enterPhone("9856");
		  vu.clickOnSearch2();
		  boolean isPhonenum=vu.isPhoneDisplayed();
		  Assert.assertTrue(isPhonenum);
  }
}


