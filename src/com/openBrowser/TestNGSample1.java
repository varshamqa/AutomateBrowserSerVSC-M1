package com.openBrowser;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample1 
{
	
	
	@Test
	void run()
	{
		System.out.println("This is my Sample Test Case1...");
		}
	@Test(groups="SmokeTest")
	void run1()
	{
		System.out.println("Test case 2...");
		
	}
	@Test(groups="SmokeTest")
	void run2()
	{
		System.out.println("Test case 3...");
		
	}
	
@BeforeTest
void run3()
{
	System.out.println("At before Test Anotation...");
}
@AfterTest
void run4()
{
	System.out.println("At After Test Anotation...");
}

@BeforeClass
void run5()
{
	System.out.println("At Before Class Anotation...");
}

@AfterClass
void run6()
{
	System.out.println("At After Class Anotation...");
}

@BeforeMethod
void run7()
{
	System.out.println("At Before Method Test Anotation...");
}

@AfterMethod
void run8()
{
	System.out.println("At After Method Test Anotation...");
	
}

@BeforeGroups
void run9()
{
	System.out.println("At Before Groups Test Anotation...");
}
@AfterGroups
void run10()
{
	System.out.println("At After Groups Test Anotation...");
}
@BeforeSuite
void run11()
{
	System.out.println("At Before Suite Test Anotation...");
}

@AfterSuite
void run12()
{
	System.out.println("At After Suite Test Anotation...");
}
}
