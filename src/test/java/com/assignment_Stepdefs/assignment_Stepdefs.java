package com.assignment_Stepdefs;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.assignment_Pageobjects.WebDriver_PageFactory;
import com.assignment_Pageobjects.assignment_2_Page_Objects;
import com.assignment_Pageobjects.assignment_3_Pageobject;
import com.assignment_Pageobjects.assignment_4_Page_Objects;
import com.assignment_Pageobjects.assignment_5_PageObject;
//import com.assignment_Pageobjects.assignment_4_Page_Objects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class assignment_Stepdefs {

	private WebDriver driver;
	Scenario scn;
	String Expectedd ="http://automationpractice.com/index.php";
	//String url ="http://automationpractice.com";
	//WebDriver_PageFactory webdriver;
	assignment_2_Page_Objects test2;
	assignment_3_Pageobject test3;
	assignment_4_Page_Objects test4;
	assignment_5_PageObject test5;
	
	String main_URL = "http://automationpractice.com";
	
	@Before
	public void setup(Scenario scn) throws Exception{
		this.scn=scn;
		//WebDriver_PageFactory.getWebDriverForBrowser("chrome");
		//webdriver = new WebDriver_PageFactory();
		driver = new ChromeDriver();
		test2 = new assignment_2_Page_Objects(driver);
		test3 = new assignment_3_Pageobject(driver);
		test4 = new assignment_4_Page_Objects(driver);
		test5 = new assignment_5_PageObject(driver);
		driver.manage().window().maximize();
		scn.log("chrome open success");	
	}

	@After
	public void teardown() {
		driver.quit();
 		scn.log("driver quite success");	
	}

	@Given("open the URL")
	public void open_the_url() {
		driver.get(main_URL);
		scn.log("URL open");
	}

	@When("Get URL expected and validate")
	public void get_url_expected_and_validate() {
		String Actual = driver.getCurrentUrl();
			assertTrue(Actual.equalsIgnoreCase(Expectedd));
			scn.log("URL validation success");
		}
	
	@Then("get title")
	public void get_title() {
		String name = driver.getTitle();
		scn.log("the title of page is :--"+name);	
	}

	@When("Check logo display")
	public void check_logo_display() {
		test2.LogoDisplayCheck();
		scn.log("Logo is visible");
	}
	@When("get Hight and width of logo and compaire")
	public void get_hight_and_width_of_logo_and_compaire() {
		test2.diamension();
		scn.log("height and width is matched");
	}
	
	@When("Validate main product categories count should be three")
	public void validate_main_product_categories_count_should_be_three() {
	    test3.Categoriess();
	    scn.log("expected count is matched");
	}
	@Then("Get the list")
	public void Get_the_list() {
		test3.getlistt();
	}
	
	
	@When("enter T-Shirt in textbox")
	public void enter_in_textbox() {
		test4.searchingProduct();
		scn.log(" i entered 'T-Shirt' in searchbox");
		
	}

	@Then("Validate the condition")
	public void validate_the_condition() {
	    test4.suggestion();
	    scn.log("the suggestion contains the name :- T-Shirt ");
	}
	
	@When("click on twitter logo")
	public void click_on_twitter_logo() {
	    test5.clickOnTwitter();
	    scn.log("i clicked on Twitter_Logo");
	}

	@Then("validate url in new window")
	public void validate_url_in_new_window() {
	    test5.ValidateURL();
	    scn.log("validated 'seleniumfrmwrk' contains in New Tab URL ");
	}
	@Then("validate account name")
	public void validate_account_name() {
	    test5.validateName();
	    scn.log("Account name is same as 'Selenium Framework'");
	}
}

