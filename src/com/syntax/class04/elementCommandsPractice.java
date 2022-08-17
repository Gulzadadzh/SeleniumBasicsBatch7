package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementCommandsPractice {
	public static String url="http://syntaxprojects.com/basic-radiobutton-demo.php";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		
		WebElement check=driver.findElement(By.xpath("//input[@value='Female']"));
		check.click();
		
		WebElement button=driver.findElement(By.xpath("//button[@id ='buttoncheck']"));
				button.click();
		System.out.println(button.getText());
		
		
		
		
		
		
	}
}
