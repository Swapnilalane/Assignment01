//package com.assignment_Stepdefs;
//
//import org.openqa.selenium.WebDriver;
//
//import com.assignment_Pageobjects.WebDriver_PageFactory;
//import com.assignment_Pageobjects.assignment_3_Pageobject;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class test3steps {
//	Scenario scn;
//	WebDriver driver;
//	assignment_3_Pageobject test3;
//	//WebDriver_PageFactory driverfactory;
//	String main_URL = "http://automationpractice.com";
//	
//	@Before
//	public void setup(Scenario scn) {
//		this.scn=scn;
//		
//		//driverfactory = new WebDriver_PageFactory();	
//	}
//	@Given("open the url")
//	public void open_the_url() {
//		test3 = new assignment_3_Pageobject(driver);
//		driver.get(main_URL);
//		
//		scn.log("URL open");
//	}
//	@When("Validate main product categories count should be three")
//	public void validate_main_product_categories_count_should_be_three() {
//		test3.Categoriess();
//		scn.log("expected count is matched");
//	}
//	@Then("Get the list")
//	public void Get_the_list() {
//		test3.getlistt();
//	}
//
//}
