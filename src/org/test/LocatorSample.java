package org.test;
import java.awt.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sprint.com/");
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		WebElement Shop =driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/div/div/ul[1]/li[2]/a/span"));
		ac.moveToElement(Shop).perform();
		Thread.sleep(1000);
		WebElement unlimited =driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/div/div/ul[1]/li[2]/div/ul/li/ul/li[2]/a"));
		unlimited.click();
		
		//driver.quit	
	}

}