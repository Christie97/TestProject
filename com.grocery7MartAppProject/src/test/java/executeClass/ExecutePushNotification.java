package executeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPage;
import elementRepository.PushNotificationPage;


public class ExecutePushNotification extends BaseClass {
	LoginPage lp;
	PushNotificationPage pn;
  @Test(priority=1)
  public void verifyThePushNotoficationPageIsDisplayedWhileClickingOnPushNotification() throws IOException 
  {
	  lp=new LoginPage(driver);
		pn=new PushNotificationPage(driver);
		  lp.enterUserName(pn.readUserName(0, 1));
		  lp.enterPassword(pn.readPassword(1, 1));
		  lp.clickLogin();
		  pn.clickOnPushNotification();
		  boolean textShown= pn.isPushTextDispalyed();
		  Assert.assertTrue(textShown);
  }
  @Test(priority=2)
  public void verifyTheAdminCanSendANotificationSuccessfullyOrNot() throws IOException
  {
	  lp=new LoginPage(driver);
		pn=new PushNotificationPage(driver);
		  lp.enterUserName(pn.readUserName(0, 1));
		  lp.enterPassword(pn.readPassword(1, 1));
		  lp.clickLogin();
		  pn.clickOnPushNotification();
		  pn.enterTheTitle("rotten eggs");
		  pn.enterDescription("throw out");
		  pn.clickOnSend();
		  boolean alertShown=pn.isAlertDisplayed();
		  Assert.assertTrue(alertShown);
		  		
  }
  @Test(priority=3)
  public void verifyTheResetButtonIsVisibleOrNot() throws IOException
  {
	  lp=new LoginPage(driver);
		pn=new PushNotificationPage(driver);
		  lp.enterUserName(pn.readUserName(0, 1));
		  lp.enterPassword(pn.readPassword(1, 1));
		  lp.clickLogin();
		  pn.clickOnPushNotification();
		  boolean resetButtonPresent=pn.isResetThere();
		  Assert.assertTrue(resetButtonPresent);
  }
}
