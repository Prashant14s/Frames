package com.lti.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.lti.pages.LoginPage;

public class LoginPageTest {
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}
	@Test
	public void validateTitleTest() {
		String expTitle ="OrangeHRM";
		String actTitle =lp.getTitle();
		Assert.assertEquals(actTitle,expTitle );
		
	}
	@Test
	public void validateLoginTest() {
		lp.login();
	}
	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
}

