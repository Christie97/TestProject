package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement checkBoxDemo=driver.findElement(By.xpath("//a[contains(text(),'Checkbox Demo')]"));
		checkBoxDemo.click();
		WebElement selectAll=driver.findElement(By.id("button-two"));
		selectAll.click();
		boolean all=selectAll.isDisplayed();
		System.out.println(all);

	}

}
