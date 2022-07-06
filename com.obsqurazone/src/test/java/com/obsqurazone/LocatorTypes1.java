package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypes1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement inputForm=driver.findElement(By.className("nav-link"));
		//inputForm.click();
		WebElement enterMessage=driver.findElement(By.xpath("//label[@for='inputEmail4']"));
		WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
		messageTextBox.sendKeys("hello");
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement enterValueA=driver.findElement(By.cssSelector("input#value-a"));
		enterValueA.sendKeys("20");
		WebElement enterValueB=driver.findElement(By.cssSelector("input#value-b"));
		enterValueB.sendKeys("30");
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		
		//driver.quit();
		
	}

}
