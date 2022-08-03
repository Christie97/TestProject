package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	public void clickElement(WebElement element)
	{
		element.click();
	}
	public void typeText(WebElement element, String text)
	{
		element.sendKeys(text);
	}
	public String getTextMethod(WebElement element)
	{
		return element.getText();
	}
	public boolean isDisplayedMethod(WebElement element)
	{
		return element.isDisplayed();
	}
	public boolean isSelectedMethod(WebElement element)
	{
		return element.isSelected();
	}
	public boolean isEnabledMethod(WebElement element)
	{
		return element.isEnabled();
	}
	public void addThreadSleep() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void scrollToFindAnElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);	
	}
	public String getCurrentUrl(WebDriver driver)
	{
	return getCurrentUrl(driver);
	}
	
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void scriptExecutorToClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		
	}
	public void selectFromDropDown(WebElement element,String text)
	{
		Select select= new Select(element);
		select.selectByVisibleText(text);
		
	}

	
}
