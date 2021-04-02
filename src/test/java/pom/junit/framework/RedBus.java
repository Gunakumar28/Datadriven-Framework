package pom.junit.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import baseclass.libglobal.LibGlobal;

public class RedBus extends LibGlobal{
	
	public RedBus() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath = "//*[@id='signin-block']"),@FindBy(xpath = "//*[@id='i-icon-profile']")})
	private WebElement signIn;
	
	@FindAll({@FindBy(xpath ="//li[text()='Sign In/Sign Up']"),@FindBy(id="signInLink")})
	private WebElement signUp;
	
	@FindAll({@FindBy(id="mobileNoInp"),@FindBy(xpath ="(//*[@placeholder='Enter your mobile number'])[2]")})
	private WebElement phoneNum;
	
	
	

	
	
	
}
