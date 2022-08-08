package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFramesPractice {

	public static String url = "http://uitestpractice.com/Students/Switchto";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame(0);
		WebElement textBox = driver.findElement(By.id("name"));

		textBox.sendKeys("Batch7");
		driver.switchTo().defaultContent();

		WebElement clickOnlinkText = driver.findElement(By.xpath("//h3[text()='click on the below link: ']"));
		String text = clickOnlinkText.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(iframe);
		textBox.clear();
		textBox.sendKeys("Wassup");

		driver.quit();
	}

}
