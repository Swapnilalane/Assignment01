package com.assignment_Pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.Scenario;


public class assignment_5_PageObject {


	private WebDriver driver;
	String contain = "seleniumfrmwrk";
	String TwittrName = "Selenium Framework";
	private By twitterLink = By.xpath("//li[@class='twitter']");
	private By TwitterName = By.xpath("//span//span//span[text()='Selenium Framework']");
	Scenario scn;

	public assignment_5_PageObject (WebDriver driver) {
		this.driver = driver;
	}


	public void clickOnTwitter() {
		driver.findElement(twitterLink).click();

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		driver.switchTo().window(ChildWindow);
	}

	public void ValidateURL() {
		String ActualURL = driver.getCurrentUrl();
		Assert.assertTrue(ActualURL.contains(contain));
	}
	public void validateName() {
		WebElement name = driver.findElement(TwitterName);
		String handleName = name.getText();
		Assert.assertEquals(handleName, TwittrName);
	}
}
