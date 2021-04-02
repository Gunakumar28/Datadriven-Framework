package pom.junit.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.libglobal.LibGlobal;

public class PomClassForJunit extends LibGlobal {
	public PomClassForJunit() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	
	
	@FindAll({@FindBy(xpath = "//*[@id='email']"),@FindBy(xpath = "//*[@class='inputtext _55r1 _6luy']")})
	private WebElement txtUserName;
	
	@FindAll({@FindBy(xpath = "//*[@type='password']"),@FindBy(id = "pass")})
	private WebElement txtPassword;
	
	@FindAll({@FindBy(xpath = "//*[@name='login']"),@FindBy(id = "u_0_b")})
	private WebElement btnLogIn;
	
	
	

}
