package com.assignment_testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\assignment\\assignment.feature",
		glue ="com.assignment_Stepdefs",
		tags = "",
		plugin = {
				"pretty",
				"html:target/html/htmlreport/html",
				"json:target/jason/jasonreport/jason"
		},
		dryRun = false,
		monochrome = true,
		publish = true
		)

public class assignment_TestRunner {

}