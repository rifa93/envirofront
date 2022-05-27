package org.data;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngularOptions;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class NewJob extends BaseClass{
	@BeforeClass
	private void startBrowser() {
    launchBrowser("Chrome");
	}
	
	//@AfterClass
//	private void closeBrowser() {
 //   quitBrowser();
	//}
 
	@BeforeMethod
	private void startTime() {
    Date d= new Date();
    System.out.println(d);
	}
	
	@AfterMethod
	private void endTime() {
		 Date d= new Date();
		    System.out.println(d);
	}
	
	
	@Test
	private void testCase1() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		ngdriver= new NgWebDriver(js);
launchUrl("http://54.206.66.198:8082/#/login");
ngdriver.waitForAngularRequestsToFinish();

WebElement user = driver.findElement(By.id("username"));
enterValue(user, "Shri");


WebElement pass = driver.findElement(By.id("password"));
enterValue(pass, "Admin@123");



 WebElement log = driver.findElement(ByAngularOptions.xpath("//button[@type='submit']"));
 clickButton(log);
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
 

WebElement job = driver.findElement(ByAngularOptions.xpath("(//a[@tabindex='0'])[2]"));
clickButton(job);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);



WebElement newjob = driver.findElement(ByAngularOptions.xpath("//button[@label='New']"));
clickButton(newjob);

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

WebElement drop = driver.findElement(ByAngularOptions.xpath("(//div[@role='button'])[3]"));
clickButton(drop);
 
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 




















	}

}
