package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends BaseTest{
	
	@Test 
	
	public void testlogin() {
		
		HomePage homepage = new HomePage(driver);
		
		LoginPage loginpage =new LoginPage(driver);
		
		homepage.clickLoginButton();
		
		loginpage.enterUsername("Shajan97");
		
		loginpage.enterPassword("password@123");
		
		loginpage.clickLoginButton();
		
		// Add assertion to verify successful login
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"nameofuser\"]")));
		
		Assert.assertTrue(welcomeMessage.isDisplayed(), "Login Successful! Welcome Shajan97");
		
		System.out.println("Login Successful! Welcome Shajan97");	
		
	}

}
