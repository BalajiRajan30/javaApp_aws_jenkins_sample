package com.mac.springproject;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mac.springproject.seleniumConfig.WebDriverConfig;

import dev.failsafe.internal.util.Assert;

@SpringBootTest
class ParentSpringprojectApplicationTests extends AbstractTestNGSpringContextTests {

	@Autowired
	WebDriver webDriver;

	@BeforeClass
	public void setUp() throws Exception {
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String url = "https://www.evokeadmin.com/login";
		String username = "Brajan@revspringinc.com";
		String password = "Iamcool@@9";

		webDriver.navigate().to(url);

		webDriver.manage().window().maximize();

		webDriver.findElement(By.id("Login-Form-UserName")).sendKeys(username);

		webDriver.findElement(By.id("Login-Form-Password")).sendKeys(password);
		
		webDriver.findElement(By.xpath("//button[contains(text(), Login-Form-)]")).click();

	}

//	@Test
//	void contextLoads() {
//		System.out.println("First Test case and the count number"+ Thread.currentThread().getId());
//	}

	@Test
	void loginPage() throws InterruptedException {

		System.out.println("First Test case and the count number"+ Thread.currentThread().getId());

		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-bars ng-tns-c168-0']")));

		Boolean status = element.isDisplayed();

		//System.out.println("Element status " + status);

		webDriver.findElement(By.xpath("//i[@class='fa fa-bars ng-tns-c168-0']")).click();

		webDriver.findElement(By.id("side-bar-search-tree-view-group")).sendKeys("QAD");

		webDriver.findElement(By.xpath("//div[text()=' QADeploymentTest ']")).click();

		webDriver.findElement(By.xpath("//i[@class='fa fa-cog outerIcon']")).click();
		
		WebDriverWait waits = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		
	WebElement ele =	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon-bar ng-star-inserted']/child::a[6]")));
		
	Boolean present = ele.isDisplayed();

	System.out.println("Element status " + present);

		webDriver.findElement(By.xpath("//div[@class='icon-bar ng-star-inserted']/child::a[6]")).click();

		Thread.sleep(10000);

	}
	
	
	@Test(enabled = false)
	void testSection() throws InterruptedException {

		System.out.println("Second Test case and the count number"+ Thread.currentThread().getId());

		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id = 'ConfigSummary-label']")));

		Boolean status = element.isDisplayed();

		//System.out.println("Element status " + status);

		webDriver.findElement(By.xpath("//i[@class='fa fa-bars ng-tns-c168-0']")).click();

		webDriver.findElement(By.id("side-bar-search-tree-view-group")).sendKeys("QAD");

		webDriver.findElement(By.xpath("//div[text()=' QADeploymentTest ']")).click();

		webDriver.findElement(By.xpath("//i[@class='fa fa-cog outerIcon']")).click();

		Thread.sleep(2000);

	}
	
	@AfterClass
	public void tearDown()
	{
		if(webDriver != null)
		{
			webDriver.quit();
		}
	}

}
