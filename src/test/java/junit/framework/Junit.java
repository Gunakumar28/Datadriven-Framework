package junit.framework;



import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import baseclass.libglobal.LibGlobal;
import pom.junit.framework.PomClassForJunit;

public class Junit extends LibGlobal {
	LibGlobal global = new  LibGlobal();
	PomClassForJunit pom = new PomClassForJunit();
	@BeforeClass
	public static void driverLaunch() {
		
		getDriver();
		launchUrl("https://www.facebook.com/");
		}
	@Before
	public void dateAndTime() {
	Date date = new Date();
	System.out.println(date);
	}
	@Test
	public void faceBookLogIn() {
		global.txtUserName(pom.getTxtUserName(),"guna");
		global.assertEqualsMethod(pom.getTxtUserName(), "guna");
		}
	@Test
	public void facebookPasssword() {
		global.txtPassword(pom.getTxtPassword(), "222222");
		global.assertEqualsMethod(pom.getTxtPassword(),"11121122");
	}
	@Test
	public void btnLogin() {
		global.btnClick(pom.getBtnLogIn());
		}
	@After
	public void dateAndtime() {
		Date date = new Date();
		System.out.println(date);
		}
	@AfterClass
	public static void QuitBrowser() {
		close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
