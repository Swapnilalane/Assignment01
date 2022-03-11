//package com.assignment_Stepdefs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.assignment_Pageobjects.WebDriver_PageFactory;
//import com.assignment_Pageobjects.assignment_4_Page_Objects;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class test4steps {
//	
//	private WebDriver driver;
//	assignment_4_Page_Objects test4;
//	String main_URL = "http://automationpractice.com";
//	
//	
//	@Before()
//	public void setup() {
//		
//		driver = new ChromeDriver();
//		test4 = new assignment_4_Page_Objects(driver);
//		driver.manage().window().maximize();
//		
//	}
//	
//	@Given("open the URL")
//	public void open_the_url() {
////		WebDriver_PageFactory.navigateToTheUrl(main_URL);
//		driver.get(main_URL);
//	}
//		
//		//scn.log("URL open");
//
//	@When("enter T-Shirt in textbox")
//	public void enter_in_textbox() throws InterruptedException {
//		//test4 = new assignment_4_Page_Objects(driver);
//		test4.searchingProduct();
//		Thread.sleep(4);
//	}
//
//	@Then("Validate the condition")
//	public void validate_the_condition() {
//	    test4.suggestion();
//	}
//
//}
