package tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.SignupPage;

public class SignupTest extends BaseTest {
	
	@Test
	
	public void testSignup() {
		
		HomePage homePage = new HomePage(driver);
		
		SignupPage signuppage = new SignupPage(driver);
		
		homePage.clickSignupButton();
		
		signuppage.enterusername("Shajan_7997");
		
		signuppage.enterpassword("password@123");
		
		signuppage.clickSignupButton();
		
		// Add assertion to verify successful signup
		
		String ExpectedMessage = "Sign up successful.";
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				
		String ActualMessage = driver.switchTo().alert().getText();
		
		Assert.assertEquals(ActualMessage, ExpectedMessage, "Signup failed!");
			
	}
}
