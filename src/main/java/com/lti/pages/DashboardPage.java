package com.lti.pages;

import org.openqa.selenium.By;

import com.lti.base.LTIBase;

public class DashboardPage extends LTIBase {
	public boolean dashboardLabelPresent() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		
	}
	
	public boolean timeWorkSectionPresent() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	
	
	public boolean quickLaunchSectionTest(){
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
	}
	
	public boolean buzzPostSectionTest() {
		return driver.findElement(By.xpath("//p[text()='Buzz Latest Posts']")).isDisplayed();
	}
	
	public boolean myActionsSectionTest() {
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
		
	}
	
	public boolean empLeaveSectionTest() {
		 return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
	}

	public boolean empDistributionSubUnitSectionTest() {
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Sub Unit']")).isDisplayed();
	}

	public boolean empDistributionLocationSectionTest()
	{
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']")).isDisplayed();
	}


}
