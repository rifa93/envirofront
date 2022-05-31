package org.data;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngularOptions;

public class NewContractors extends BaseClass {
	@BeforeClass
	private void startBrowser() {
    launchBrowser("Chrome");
	}
	
 // @AfterClass
 //private void closeBrowser() {
   // quitBrowser();
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
	private void newCon() throws InterruptedException, AWTException, IOException {
    launchUrl("http://54.206.66.198:8082/#/login");

WebElement user = driver.findElement(By.id("username"));
enterValue(user, "Shri");


WebElement pass = driver.findElement(By.id("password"));
enterValue(pass, "Admin@123");



 WebElement log = driver.findElement(ByAngularOptions.xpath("//button[@type='submit']"));
 clickButton(log);
impWait(); 

WebElement accDet = driver.findElement(ByAngularOptions.xpath("(//a[@tabindex='0'])[3]"));
clickButton(accDet);
impWait();

WebElement view = driver.findElement(ByAngularOptions.xpath("(//a[@tabindex='0'])[4]"));
clickButton(view);
Thread.sleep(5000);

WebElement newCon = driver.findElement(ByAngularOptions.xpath("//button[@label='New']"));
clickButton(newCon);
 impWait();

WebElement BusNam = driver.findElement(ByAngularOptions.id("business_name"));
enterValue(BusNam, "ABC trading company");
impWait();

WebElement tradme = driver.findElement(ByAngularOptions.id("trading_name"));
enterValue(tradme, "exports and imports");
impWait();
WebElement abn = driver.findElement(ByAngularOptions.xpath("(//input[@type='text'])[6]"));
enterValue(abn, "12345678912");
impWait();
WebElement type = driver.findElement(ByAngularOptions.xpath("(//div[@role='button'])[1]"));
clickButton(type);
impWait();
WebElement cleint = driver.findElement(ByAngularOptions.xpath("(//li[@role='option'])[3]"));
clickButton(cleint);
impWait();


WebElement wrk = driver.findElement(ByAngularOptions.xpath("//li[@aria-label='Work Provider']"));
clickButton(wrk);
 impWait();
 
 WebElement comtype = driver.findElement(ByAngularOptions.xpath("(//div[@role='button'])[2]"));
clickButton(comtype);
impWait();

WebElement allport = driver.findElement(ByAngularOptions.xpath("(//li[@role='option'])[2]"));
clickButton(allport);
impWait();

WebElement pay = driver.findElement(ByAngularOptions.xpath("(//div[@role='button'])[2]"));
clickButton(pay);
impWait();


WebElement accName = driver.findElement(ByAngularOptions.id("account_name"));
enterValue(accName, "esakkimuthu");
impWait();

WebElement bsbCode = driver.findElement(ByAngularOptions.xpath("//input[@size='6']"));
enterValue(bsbCode, "123456");
impWait();

WebElement accNo = driver.findElement(ByAngularOptions.id("account_number"));
enterValue(accNo, "3977238");

impWait();
WebElement email = driver.findElement(ByAngularOptions.id("account_email"));
enterValue(email, "afir4u@gmail.com");

impWait();


WebElement accid = driver.findElement(ByAngularOptions.id("account_id"));
enterValue(accid, "123578");

impWait();
WebElement reb = driver.findElement(ByAngularOptions.id("rebate"));
enterValue(reb, "5%");
impWait();

WebElement name = driver.findElement(ByAngularOptions.id("main_contact_name"));

enterValue(name, "esakki muthu");
impWait();


WebElement emailid = driver.findElement(ByAngularOptions.id("email"));

enterValue(emailid, "esakkimuthu@gmail.com");

impWait();
WebElement phno = driver.findElement(ByAngularOptions.id("phone"));

enterValue(phno, "9791228889");
impWait();
WebElement alernate = driver.findElement(ByAngularOptions.id("mobile_no"));
enterValue(alernate, "8524988893");
impWait();
WebElement web = driver.findElement(ByAngularOptions.id("website"));
enterValue(web, "www.facebook.com");
impWait();


WebElement street = driver.findElement(ByAngularOptions.id("street_address"));
enterValue(street, "park town");
impWait();

WebElement suburb = driver.findElement(ByAngularOptions.id("suburb"));
enterValue(suburb, "adelide");
impWait();

WebElement post = driver.findElement(ByAngularOptions.id("postcode"));
enterValue(post, "3569871");
impWait();


WebElement save = driver.findElement(ByAngularOptions.xpath("//button[@icon='pi pi-save']"));
	
	clickButton(save);
	
	Thread.sleep(5000);
	
	scrSht("contracter not created");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
