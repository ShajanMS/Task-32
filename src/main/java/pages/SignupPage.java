package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignupPage {
	
	private WebDriver driver;

	@FindBy(id= "sign-username")
	
	private WebElement usernamefield;
	
	@FindBy(id = "sign-password")
	
	private WebElement passwordfield;
	
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	
	private WebElement signupButton;
	
	
	public SignupPage (WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterusername(String username) {
		
		usernamefield.sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		
		passwordfield .sendKeys(password);
		
	}
	
	public void clickSignupButton() {
		
		signupButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

}
