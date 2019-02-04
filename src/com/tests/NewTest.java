package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://localhost:8080/MyWebApp");
	  WebElement element = driver.findElement(By.xpath("//html/body/h2"));
	  String text = element.getText();
	  System.out.println(text);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  	
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
