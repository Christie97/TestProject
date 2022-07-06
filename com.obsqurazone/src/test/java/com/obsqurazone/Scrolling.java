package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chris\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement sanFrancisco=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[9]//td[3]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();",sanFrancisco);
		System.out.println(sanFrancisco.getText());
	}

}
