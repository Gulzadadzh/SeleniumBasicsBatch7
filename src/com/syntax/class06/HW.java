package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	public static String url ="http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		//driver.switchTo().frame(arg0);
}
}
