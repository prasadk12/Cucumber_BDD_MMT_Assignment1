package com.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightResults {
	public FlightResults(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//p[contains(text(),'Flights from')]")
	WebElement assertFlightDisplayed;
	
	public void flightsDisplayed() {
		
		String actualString = assertFlightDisplayed.getText();

		String expectedString = "Flights from";

		assert(actualString.contains(expectedString));	
	
	}
}
