package junit.framework;


import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import baseclass.libglobal.LibGlobal;
import pom.junit.framework.RedBus;

public class RedBusSignIn extends LibGlobal {
	LibGlobal lib = new LibGlobal();
	RedBus red =new RedBus();
	@BeforeClass
	public static void driverLaunch() {
		getDriver();
		launchUrl("https://www.redbus.in/");
	}
	@Before
	public void date() {
	Date date = new Date();	
	System.out.println(date);
	}
	
	
	
	
	

	}
	
	


