package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice2 {
	public static String url = "http://syntaxprojects.com/basic-checkbox-demo.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
		for (WebElement checkBoxOption : optionCheckBoxes) {
			if (checkBoxOption.isEnabled()) {
				String checkBox = checkBoxOption.getAttribute("value");
				if (checkBox.equals("Option-2")) {
					checkBoxOption.click();
					Thread.sleep(2000);
					break;
				}
			}
		}

	}
}
