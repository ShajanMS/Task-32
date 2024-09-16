package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	private WebDriver driver;
	
	
	@FindBy(id = "signin2")
	
	private WebElement signupbutton;
	
	@FindBy(id = "login2")
	
	private WebElement loginbutton;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void clickSignupButton() {
		
		signupbutton.click();
	}
	
	public void clickLoginButton() {
		
		loginbutton.click();
	}
	
}
