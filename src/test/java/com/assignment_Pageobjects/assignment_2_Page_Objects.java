package com.assignment_Pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_2_Page_Objects {
	
	int expected_Height = 99;
	int expected_Width = 350;
	private WebDriver driver;
	private By logo = By.xpath("//img[@class='logo img-responsive']");
	
	
	public assignment_2_Page_Objects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void LogoDisplayCheck() {
		driver.findElement(logo).isDisplayed();
	}
	
	public void diamension(){
		WebElement Logo = driver.findElement(logo);
		
		int Actual_width = Logo.getSize().getWidth();
		assertEquals(expected_Width,Actual_width);
		
		int Actual_height = Logo.getSize().getHeight();
		assertEquals(expected_Height,Actual_height);
		
		
	}
	
}
