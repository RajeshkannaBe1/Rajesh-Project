package org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		// SET THE PROPERTY
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium Project\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium Project\\driver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium Project\\driver\\IEDriverServer.exe");
		
		// LAUNCH THE BROWSER
		//WebDriver driver=new FirefoxDriver();
		  WebDriver driver=new ChromeDriver();
		//WebDriver driver=new InternetExplorerDriver();
	    // ENTER THE URL
		driver.get("https://www.google.com/");
		// TITLE
		String title= driver.getTitle();
		System.out.println(title);
		// ENTERED URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		// CLOSE THE BROWSER
		//driver.quit();
	}

}
