package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Junit_01 extends Junit_Report_HTML{
	WebDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
        	
	}
	
    @After
    public void teardown()
    {
    driver.quit();	
    }
    @Test
    public void myFirstTest()
    {
    	driver.findElement(By.id("userName")).sendKeys("Rajendra Babu");

        driver.findElement(By.id("userEmail")).sendKeys("RajendraBabu@gmail.com");

        WebElement cAddress = driver.findElement(By.id("currentAddress"));
        cAddress.sendKeys("123, Cross1 , Street2 , Bangalore");

        String currAdd = cAddress.getText();

       Actions actions = new Actions(driver);



       actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

       actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       actions.sendKeys(Keys.TAB).build().perform();
       actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

       WebElement pAddress = driver.findElement(By.id("permanentAddress"));
       String perAdd = pAddress.getText();

       assertEquals(currAdd, perAdd);
    }
    @Test
    public void mySecondTest()
    {
    	driver.findElement(By.id("userName")).sendKeys("Rajendra Babu");

        driver.findElement(By.id("userEmail")).sendKeys("RajendraBabu@gmail.com");

        WebElement cAddress = driver.findElement(By.id("currentAddress"));
        cAddress.sendKeys("123, Cross1 , Street2 , Bangalore");

        String currAdd = cAddress.getText();

       Actions actions = new Actions(driver);



       actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

       actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       actions.sendKeys(Keys.TAB).build().perform();
       actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

       WebElement pAddress = driver.findElement(By.id("permanentAddress"));
       String perAdd = pAddress.getText();

       assertEquals(currAdd, "ABCF");
    }
}
