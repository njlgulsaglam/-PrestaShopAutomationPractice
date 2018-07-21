package com.prestashop.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrestaShopPositiveScenerios {

		WebDriver driver;


		@BeforeMethod
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(" http://automationpractice.com/");
			driver.findElement(By.linkText("Sign in".trim())).click();
			
		}
		@Test

		public void loginTest() {
			driver.findElement(By.id("email")).sendKeys("justslience@outlook.com");
			driver.findElement(By.id("passwd")).sendKeys("12345");
			driver.findElement(By.id("SubmitLogin")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			//String actual =driver.findElement(By.cssSelector("center_column ol li")).getText();
			//String expected = "nancy nano";
			//Assert.assertTrue(actual.equals(expected));
			
}
		@AfterMethod
		public void tearDown() {
		driver.close();

		}
}
