package com.serenity.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt", 
				"html:target/cucumber/cucumber-html-report",
				"json:target/cucumber/cucumber.json"
				}
		,features= {"src/main/java/features"}
		,glue = {"com.serenity.stepDefinitions"}
		//,dryRun = true
		,tags="@smoke"
		)
public class TestRunner {

}

