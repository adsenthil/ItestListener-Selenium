package org.adactin;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(org.adactin.ListenerTest.class)			

public class TestCases extends BaseClass{				
	public static WebDriver driver;

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
	browserLaunch("chrome");
	launcherUrl("http://demo.guru99.com/V4/");
    //driver.get("http://demo.guru99.com/V4/");				
	findWebElement("name", "uid").sendKeys("mngr34926");	
	findWebElement("name", "password").sendKeys("amUpenu");	
   	findWebElement("name", "btnLogin").click();
//    driver.findElement(By.id("")).click();					
}		
@Test		
public void Login2()				
{		
	browserLaunch("chrome");
	launcherUrl("http://demo.guru99.com/V4/");
    //driver.get("http://demo.guru99.com/V4/");				
	findWebElement("name", "uid").sendKeys("mngr34926");	
	findWebElement("name", "password").sendKeys("amUpenu");	
   	findWebElement("name", "btnLon").click();
//    driver.findElement(By.id("")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}			