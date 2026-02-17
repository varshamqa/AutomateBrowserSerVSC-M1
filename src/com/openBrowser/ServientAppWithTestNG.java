package com.openBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServientAppWithTestNG 
{
	ChromeDriver driver = new ChromeDriver(); 
	
	
	@BeforeSuite
	void run()
	{
		String url="https://qa.servient.net/";
	      System.setProperty("Webdriver.chrome.driver", "/Users/varshamahajan/Downloads//chromedriver.exe");
	      
	      driver.get(url);
	      
	}
	
	@BeforeTest
	void run1()
	{
		
		driver.manage().window().maximize();
	}
	
	@Test
	void v1()
	{
		
		String PageTitle = driver.getTitle();
  		System.out.println(PageTitle);
	}
	
	@Test(description = "This is the Login Page with Credentials")
	void v2()
	{
		
		WebElement txtbox1 = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		txtbox1.sendKeys("sanu.c@gmail.com");
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		txtbox2.sendKeys("Sharad@1986");
		WebElement submitTxt = driver.findElement(By.xpath("//button[@class='mat-focus-indicator ser-button submit-btn mat-raised-button mat-button-base mat-primary']"));
		submitTxt.click();
	    // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	     
		
	}
	@Test(description = "This is the SwitchBioard Of Appliction")
	void v3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement switchBoard = driver.findElement(By.xpath("//div[@class='review-blue ng-star-inserted']"));
		switchBoard.click();
		
	}
	@Test(description="Case selection...")
	void v4()
	{
		driver.findElement(By.xpath("//td [ text()='EDis482Canvas086 19March25 EDAPP-15300']")).click();
	}
	
	
	
	@Test(description = "This the Search Functionality with Full-Text Search")
	 void v5() 
	{

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/textarea[@placeholder='Search...']")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div/textarea[@placeholder='Search...']")).sendKeys("subject;this w/10 has;com*");
		

		WebElement searchBar = driver.findElement(By.xpath("//button[@mattooltip='Search']"));
		searchBar.click();
	}
	@Test(description= "This is Refresh page Functionality")
	void v6()
	{
		WebElement browse = driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate main-menu-icon material-icons ser-menu-book mat-icon-no-color ng-star-inserted']"));
		browse.click();
	 
	}
	
	
	@Test(description = "This is the Sample Feature")
	void v7() 
	{
		
		 driver.findElement(By.xpath("//button[@mattooltip='Samples']")).click();
		 driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
			
			driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
			
			driver.findElement(By.xpath("//input[@data-placeholder='Sample Name']")).sendKeys("SampleVVM1");
			
			
			driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
		
		
	}
	
	
	@AfterTest
	void v8()
	{
		driver.quit();
	}
}
