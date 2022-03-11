package com.assignment_Pageobjects;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.Scenario;

public class assignment_3_Pageobject {

	
	
	Scenario scn;
	WebDriver driver;
	private By categories = By.xpath("//*[@id=\"block_top_menu\"]/ul/li");
	int expectedcount = 3;

	public assignment_3_Pageobject(WebDriver driver) {
		this.driver=driver;
	}
	public void Categoriess () {
		List<WebElement> ListOfCategories = driver.findElements(categories);
		int actual =ListOfCategories.size();
		assertEquals(expectedcount, actual);
	}
	
	public void getlistt() {
		List<WebElement> lisst = driver.findElements(categories);
		lisst.toArray();
	}
}