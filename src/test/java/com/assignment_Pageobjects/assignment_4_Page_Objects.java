package com.assignment_Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Scenario;

public class assignment_4_Page_Objects {
	
	Scenario scn;
	private WebDriver driver = null;
	private By searchbox = By.xpath("//input[@id=\"search_query_top\"]");
	private By suggestion = By.xpath("//*[@id=\"index\"]/div[2]/ul/li");

	public assignment_4_Page_Objects(WebDriver driver) {
		this.driver=driver;
	} 

	public void searchingProduct() {
		driver.findElement(searchbox).sendKeys("T-Shirt");
	}
	
	public void suggestion() {
		List<WebElement> name = driver.findElements(suggestion);
		if(name.contains("T-Shirt")) {
			scn.log("the suggestion contains the name :- T-Shirt ");
		}
		
	}
}
