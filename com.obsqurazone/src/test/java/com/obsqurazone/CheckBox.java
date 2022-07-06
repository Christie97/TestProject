package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement checkBoxDemo=driver.findElement(By.xpath("//a[contains(text(),'Checkbox Demo')]"));
		checkBoxDemo.click();
		WebElement check=driver.findElement(By.id("gridCheck"));
		check.click();
		WebElement checkTwo=driver.findElement(By.id("check-box-two"));
		checkTwo.click();
		boolean isSelectedCheck=check.isSelected();
		System.out.println(isSelectedCheck);
		boolean isSelectedCheckTwo=checkTwo.isSelected();
		System.out.println(isSelectedCheckTwo);

	}

}
