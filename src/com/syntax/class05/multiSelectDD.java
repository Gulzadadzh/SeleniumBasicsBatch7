package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDD {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		 WebElement statesDD = driver.findElement(By.id("multi-select"));
	        Select select = new Select(statesDD);
	        boolean isMultiple = select.isMultiple();
	        System.out.println(isMultiple);

	        if(isMultiple) {
	            List<WebElement> options = select.getOptions();
	            for(WebElement option: options) {
	                String optionText = option.getText();
	                select.selectByVisibleText(optionText);
	                Thread.sleep(1000);
	            }
	        }

	       select.deselectByIndex(5);
	       // select.deselectAll();
	       Thread.sleep(2000);
	        driver.quit();
	    }
	}