package executeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.ManageUserPage;


public class ExecuteManageUser extends BaseClass{
	LoginPage lp;
	ManageUserPage mu;
  @Test
  public void verifyTheListUsetPageIsDisplayedWhileClickingOnManageUsers() throws IOException {
	lp=new LoginPage(driver);
		mu=new ManageUserPage(driver);
		  lp.enterUserName(mu.readUserName(0, 1));
		  lp.enterPassword(mu.readPassword(1, 1));
		  lp.clickLogin();
		  mu.clickManageUser();
		  boolean isText=mu.isManageUserTextDisplayed();
		  Assert.assertTrue(isText);
  }
  @Test
  public void verifyTheUsetCanSearchAUserByUsingName() throws IOException
  {
	  lp=new LoginPage(driver);
		mu=new ManageUserPage(driver);
		  lp.enterUserName(mu.readUserName(0, 1));
		  lp.enterPassword(mu.readPassword(1, 1));
		  lp.clickLogin();
		  mu.clickManageUser();
		  mu.clickSearch();
		  mu.enterName("roshan");
		  mu.clickSearch2();
		  boolean isSearchName=mu.isNameTextDisplayed();
		  Assert.assertTrue(isSearchName);
  }
  @Test
  public void verifyTheUsetCanSearchAUserByUsingEmailId() throws IOException
  {
	  lp=new LoginPage(driver);
		mu=new ManageUserPage(driver);
		  lp.enterUserName(mu.readUserName(0, 1));
		  lp.enterPassword(mu.readPassword(1, 1));
		  lp.clickLogin();
		  mu.clickManageUser();
		  mu.clickSearch();
		  mu.enterEmail("roshan");
		  mu.clickSearch2();
		  boolean isSearchEmail=mu.isEmailDisplayed();
		  Assert.assertTrue(isSearchEmail);
  }
  @Test
  public void verifyAdminCanChangeTheStatusOfAnyUser() throws IOException
  {
	  lp=new LoginPage(driver);
		mu=new ManageUserPage(driver);
		  lp.enterUserName(mu.readUserName(0, 1));
		  lp.enterPassword(mu.readPassword(1, 1));
		  lp.clickLogin();
		  mu.clickManageUser();
		  mu.clickSearch();
		  mu.enterName("roshan");
		  mu.clickSearch2();
		  mu.clickOnStatus();
		  boolean isAlert=mu.isAlertDisplayed();
		  Assert.assertTrue(isAlert);
		  
  }
}
