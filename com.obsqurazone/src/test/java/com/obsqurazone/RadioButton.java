package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
		WebElement femaleButton = driver.findElement(By.id("inlineRadio2"));
		femaleButton.click();
		boolean fmBtn = femaleButton.isSelected();
		System.out.println(fmBtn);
		WebElement femaleText = driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
		String female = femaleText.getText();
		System.out.println(female);
		boolean fmTxt = femaleText.isDisplayed();
		System.out.println(fmTxt);

	}

}
