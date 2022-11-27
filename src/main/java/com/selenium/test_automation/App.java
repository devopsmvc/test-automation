package com.selenium.test_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */

public class App 
{
	
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\Desktop\\STAR\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	//chromeOptions.addArguments("--headless");
    	//chromeOptions.addArguments("--no-sandbox");
    	//chromeOptions.addArguments("--disable-dev-shm-usage");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	System.out.println("Welcome to the Selenium Scripts");
    	
    	driver.get("http://3.110.130.88:8081/addressbook/");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.findElement(By.className("v-button")).click();
    	
    	driver.findElement(By.id("gwt-uid-5")).sendKeys("Mahesh");
    	driver.findElement(By.id("gwt-uid-7")).sendKeys("Varma");
    	driver.findElement(By.id("gwt-uid-9")).sendKeys("1234567890");
    	driver.findElement(By.id("gwt-uid-11")).sendKeys("devopsmvc@gmail.com");
    	driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015,");
    	
    	driver.findElement(By.className("v-button-primary")).click();
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.quit();
    	
    	System.out.println("Testcase executed sucessfully");
    
    }
}