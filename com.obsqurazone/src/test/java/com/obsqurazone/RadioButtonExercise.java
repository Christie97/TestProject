package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement radioButtonDemo = driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
		radioButtonDemo.click();
		WebElement maleclick=driver.findElement(By.id("inlineRadio1"));
		maleclick.click();
		WebElement showSelectedValue=driver.findElement(By.id("button-one"));
		showSelectedValue.click();
		WebElement message=driver.findElement(By.id("message-one"));
		String ms=message.getText();
		System.out.println(ms);
		
		
	}

}
