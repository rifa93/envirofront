package org.data;

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
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
	
  @AfterClass
 private void closeBrowser() {
    quitBrowser();
	}
 
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
	private void testCase1() throws InterruptedException, IOException {
		//JavascriptExecutor js =(JavascriptExecutor)driver;
	//	ngdriver= new NgWebDriver(js);
launchUrl("http://54.206.66.198:8082/#/login");
//ngdriver.waitForAngularRequestsToFinish();

WebElement user = driver.findElement(By.id("username"));
enterValue(user, "Shri");


WebElement pass = driver.findElement(By.id("password"));
enterValue(pass, "Admin@123");



 WebElement log = driver.findElement(ByAngularOptions.xpath("//button[@type='submit']"));
 clickButton(log);
impWait(); 


WebElement job = driver.findElement(ByAngularOptions.xpath("(//a[@tabindex='0'])[2]"));
clickButton(job);
impWait();

scrSht("valid login");
WebElement newjob = driver.findElement(ByAngularOptions.xpath("//button[@label='New']"));
clickButton(newjob);

impWait();

WebElement conName = driver.findElement(ByAngularOptions.xpath("(//input[@type='text'])[22]"));

enterValue(conName, "esakki muthu");


WebElement bestCon = driver.findElement(ByAngularOptions.xpath("(//input[@type='text'])[24]"));
enterValue(bestCon, "jawahar");

impWait();

WebElement emailCon = driver.findElement(ByAngularOptions.xpath("(//input[@type='text'])[23]"));
enterValue(emailCon, "esakkimuthu8220736018@gmail.com");
impWait();




impWait();
Thread.sleep(5000);


impWait();

scrSht("details filled");

WebElement aloc = driver.findElement(By.id("tab-allocation"));
clickButton(aloc);
impWait();
Thread.sleep(1000);
WebElement ok = driver.findElement(ByAngularOptions.xpath("//button[@label='Ok']"));
clickButton(ok);
 
 
WebElement insDet = driver.findElement(ByAngularOptions.id("tab-contact"));
clickButton(insDet);
impWait();

WebElement adddet = driver.findElement(ByAngularOptions.xpath("//div[@class='add']"));
clickButton(adddet);


impWait();


WebElement firstName = driver.findElement(ByAngularOptions.id("first_name"));
enterValue(firstName, "esakki ");



WebElement lastName = driver.findElement(ByAngularOptions.id("last_name"));
enterValue(lastName, "muthu");


WebElement street = driver.findElement(ByAngularOptions.id("street_address"));
enterValue(street, "radha nagar");


WebElement suburb = driver.findElement(ByAngularOptions.id("suburb"));
enterValue(suburb, "123458");

WebElement post = driver.findElement(ByAngularOptions.id("postcode"));
enterValue(post, "614903");


WebElement sch = driver.findElement(ByAngularOptions.id("tab-schedule"));
clickButton(sch);
impWait();
scrSht("error message");

WebElement newsch = driver.findElement(ByAngularOptions.xpath("//button[@label='Schedule']"));
clickButton(newsch);

WebElement text = driver.findElement(ByAngularOptions.xpath("//textarea[@cols='30']"));
enterValue(text, "the schedule must be in time");


WebElement phNo = driver.findElement(ByAngularOptions.id("phoned"));
enterValue(phNo, "97912288889");


WebElement save2 = driver.findElement(ByAngularOptions.xpath("//button[@label='Save']"));
clickButton(save2);
impWait();


scrSht("scheduled saved");

Thread.sleep(5000);

WebElement update = driver.findElement(ByAngularOptions.xpath("//label[@title= 'Update Job Status']"));
clickButton(update);

impWait();
scrSht("Errormessage 2");
	
	
WebElement save3 = driver.findElement(ByAngularOptions.xpath("//button[@label='Save']"));

clickButton(save3);

impWait();

scrSht("error message 3");
	
impWait();

scrSht("return to 1st step");
	
	
	
	
	}

}
