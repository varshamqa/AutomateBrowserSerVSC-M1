package com.openBrowser;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException
	{
      String url="https://qa.servient.net/";
      System.setProperty("Webdriver.chrome.driver", "/Users/varshamahajan/Downloads//chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      
      driver.get(url);
      driver.manage().window().maximize();
      
      String PageTitle = driver.getTitle();
  		System.out.println(PageTitle);
 
  		 //	driver.quit();
  		WebElement txtbox1 = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		txtbox1.sendKeys("sanu.c@gmail.com");
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		txtbox2.sendKeys("Sanavi@2014");
		WebElement submitTxt = driver.findElement(By.xpath("//button[@class='mat-focus-indicator ser-button submit-btn mat-raised-button mat-button-base mat-primary']"));
		submitTxt.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	     
		WebElement switchBoard = driver.findElement(By.xpath("//div[@class='review-blue ng-star-inserted']"));
		switchBoard.click();
		//driver.findElement(By.xpath("//td[text()='29thJan2026Smoke']")).click();
		
		//* eDiscoveryCanvas *//
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("textArea")));
		
		Thread.sleep(60000);
		//WebElement CanvasLogo = driver.findElement(By.xpath("//button[@aria-label='Canvas']"));
		//CanvasLogo.click();
		//WebElement txtboxc1 = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		//txtboxc1.sendKeys("sanu.c@gmail.com");
		//WebElement txtboxc2 = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		//txtboxc2.sendKeys("Sanavi@2014");
		//WebElement submitTxt1 = driver.findElement(By.xpath("//button[@class='mat-focus-indicator ser-button submit-btn mat-raised-button mat-button-base mat-primary']"));
		//submitTxt1.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		 WebElement textArea = driver.findElement(By.xpath("//div/textarea[@placeholder='Search...']"));
		textArea.sendKeys("subject;this w/10 has;com*");
		Thread.sleep(10000);
		WebElement searchBar = driver.findElement(By.xpath("//button[@mattooltip='Search']"));
		searchBar.click();
		Thread.sleep(10000);
		WebElement menuBar = driver.findElement(By.xpath("//button[@class='mat-focus-indicator header-button nav-menu-button mat-button mat-icon-button mat-button-base ng-star-inserted']"));
		menuBar.click();
		
		
		WebElement browse = driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate main-menu-icon material-icons ser-menu-book mat-icon-no-color ng-star-inserted']"));
		browse.click();

		//WebElement facet = driver.findElement(By.xpath("//div[@class='k-collapse-prev k-icon k-i-arrow-60-right']"));
		//facet.click();
	
		
		WebElement sample = driver.findElement(By.xpath("//button[@mattooltip='Samples']"));
		sample.click();
		Thread.sleep(10000);
	
		driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container']")).click();
		
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
		
	driver.findElement(By.xpath("//input[@data-placeholder='Sample Name']")).sendKeys("SampleVVM1"); 
		
		
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
		//Production Tag Creation OR Batch Assign
		//driver.findElement(By.xpath("//mat-select[@id='mat-select-10']")).click();
		//driver.findElement(By.xpath("//mat-option[@id='mat-option-22']")).click();
		//driver.findElement(By.xpath("//input[@id='selectAllCheckboxId']")).click();
		//driver.findElement(By.xpath("//ser-batch-operations[@aria-label='Batch Operations']")).click();
		//driver.findElement(By.xpath("//button[text()='Assign']")).click();
		//driver.findElement(By.xpath("//span[text()='ADD TAG']")).click();
		//driver.findElement(By.xpath("//tree[@class='ng-tns-c893-130']")).click();
		//driver.findElement(By.xpath("//label[@for='mat-checkbox-23-input']")).click();
		//driver.findElement(By.xpath("//div[@class='bottom-section']")).click();
		//driver.findElement(By.xpath("bottom-section ng-star-inserted")).click();
		//driver.findElement(By.xpath("//label[@for='mat-checkbox-7-input']")).click();// Also Change Values on Thread Members
		//driver.findElement(By.xpath("//label[@for='mat-checkbox-8-input']")).click(); // Also Change Values on Family Members
		//driver.findElement(By.xpath("//label[@for='mat-checkbox-9-input']")).click(); //Also Change Values on Duplicate Members
		//driver.findElement(By.xpath("//span[text()='APPLY VALUES']")).click();
		
		//For Facet Tag
		//driver.findElement(By.xpath("//div[@class='k-collapse-prev k-icon k-i-arrow-60-right']")).click();
		
		
		//New Production 
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator header-button nav-menu-button mat-button mat-icon-button mat-button-base ng-star-inserted']")).click();
		
		driver.findElement(By.xpath("//a[text()='Production']")).click();
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator ser-button mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()=' Production Tag: ']")).click();
		//driver.findElement(By.xpath("//mat-tree-node[@class='field cdk-tree-node mat-tree-node ng-star-inserted']")).click();
		
		driver.findElement(By.xpath("//input[@id='mat-checkbox-6-input']")).click();
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator ser-button ng-tns-c975-217 mat-stroked-button mat-button-base mat-primary']")).click();
		driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c135-221 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']")).sendKeys("SmokeTestProdV1");
		driver.findElement(By.xpath("//span[@class='ng-tns-c975-217 ng-star-inserted']")).click();
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c135-235']")).sendKeys("SmokeTestProdV1_");
		driver.findElement(By.xpath("//mat-icon[@aria-label='apply icon-button']")).click();
		
		driver.findElement(By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c487-70']")).click();
		driver.findElement(By.xpath("//input[@id=0]")).click();
		driver.findElement(By.xpath("//mat-action-row[@class='mat-action-row ng-tns-c485-69']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='containerPassword']")).sendKeys("aa");
		driver.findElement(By.xpath("//input[@formcontrolname='confirmContainerPassword']")).sendKeys("aa");
		driver.findElement(By.xpath("//div[@class='submit-btn ng-tns-c975-60']")).click();
		
		//driver.findElement(By.xpath(f'//*[@id='{5}']"));
		//*[@id="5"]
		// driver.quit();
	}

}
