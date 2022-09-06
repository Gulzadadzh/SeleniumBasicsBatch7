package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementCommandsPractice2 {
	
	public static String url="http://syntaxprojects.com/basic-radiobutton-demo.php";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement FemalecheckBox=driver.findElement(By.xpath("//input[contains(@name, 'gender')]"));
		FemalecheckBox.click();
		
		List<WebElement> checkBox=driver.findElements(By.xpath("//label[@class='radio-inline']"));
		for (WebElement checkBoxEach : checkBox) {
			if(checkBoxEach.isEnabled()) {
				String box=checkBoxEach.getAttribute("value");
				if(box.equals("5 - 15")) {
					checkBoxEach.click();
					Thread.sleep(2000);
					break;
				}
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
}
}