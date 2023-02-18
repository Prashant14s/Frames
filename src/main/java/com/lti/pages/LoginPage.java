package com.lti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lti.base.LTIBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends LTIBase {
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	public DashboardPage login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		return new DashboardPage();
	}

}
