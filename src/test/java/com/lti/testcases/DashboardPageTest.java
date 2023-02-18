package com.lti.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lti.base.LTIBase;
import com.lti.pages.DashboardPage;
import com.lti.pages.LoginPage;

public class DashboardPageTest {
	LoginPage lp;
	DashboardPage dp;
	
	
	@BeforeMethod
	public void browserSetup() {
		lp=new LoginPage();
	lp.initialization();
	}
	@Test
	public void validateDashboardLabelTest() {
		dp = lp.login();
		Assert.assertTrue(dp.dashboardLabelPresent());
	}
	
	//6 test cases for 6 sections
	
	@Test
	public void validateTimeAtWorkSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.dashboardLabelPresent());
	}
	

	@Test
	public void quickLaunchSectionTest(){
		dp = lp.login();
		Assert.assertTrue(dp.quickLaunchSectionTest());
	}
		@Test
	public void buzzPostSectionTest() {
			dp = lp.login();
			Assert.assertTrue(dp.buzzPostSectionTest());
		}
		

	@Test
	public void myActionsSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.myActionsSectionTest());
	}

	@Test
	public void empLeaveSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.empLeaveSectionTest());
	}
	@Test
	public void empDistributionSubUnitSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.empDistributionSubUnitSectionTest());
	}
	@Test
	public void empDistributionLocationSectionTest() {
		dp = lp.login();
		Assert.assertTrue(dp.empDistributionLocationSectionTest());
	}
	
	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
}


