package org.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static NgWebDriver ngdriver;
	public static void launchBrowser(String Browser) {
	if (Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	else if (Browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
	}
	else {
		WebDriverManager.firefoxdriver().setup();
	}
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
		String title = driver.getTitle();
	System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   driver.manage().window().maximize();
	    
	}
     public static void quitBrowser() {
     driver.close();
	}
	public static void clickButton(WebElement e) {
		e.click();
	}

	public static void enterValue(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void doubleclick(WebElement e) {
      Actions a= new Actions(driver);
      a.doubleClick(e).build().perform();
	}
	public static void movemouse(WebElement e) {
		Actions a= new Actions(driver);
		a.moveToElement(e);
	}
	
	public static void selectOption(WebElement e , String value) {
         Select s =new Select(e);
         s.selectByVisibleText( value);
	}	
	

}



