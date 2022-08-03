package executeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ExecuteDashboardPage extends BaseClass{
  DashboardPage dp;
  LoginPage lp;
	@Test
	public void verifyDashboardVisibleAfterSuccessfulLogin() throws IOException 
	{
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		  lp.enterUserName(dp.readUserName(0, 1));
		  lp.enterPassword(dp.readPassword(1, 1));
		  lp.clickLogin();
		  boolean dashboardTextDisplay=dp.dashboardTextDispalyed();
		  Assert.assertTrue(dashboardTextDisplay);
    }
	@Test
	public void verifyManagePageTilePresentOrNot() 
	{
		lp=new LoginPage(driver);
		  lp.enterUserName("admin");
		  lp.enterPassword("admin");
		  lp.clickLogin();
		dp=new DashboardPage(driver);
		  String expectedManageTitleName="Manage Pages";
		  String actualManageTitleName=dp.managePageGetText();
		  Assert.assertEquals(actualManageTitleName, expectedManageTitleName);  
	}
	@Test
	public void verifyListPagesOpensByClickingOnMoreInfoOfManagePage()
	{
		lp=new LoginPage(driver);
		  lp.enterUserName("admin");
		  lp.enterPassword("admin");
		  lp.clickLogin();
		dp=new DashboardPage(driver);
		dp.ClickmoreInfo();
		boolean managePageTextDispalyed=dp.islistPageTextDisplayed();
		Assert.assertTrue(managePageTextDispalyed);
	}
	
}
