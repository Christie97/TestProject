package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("christieannasajan123@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("@@123456!Cas");
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		driver.quit();

	}

}
