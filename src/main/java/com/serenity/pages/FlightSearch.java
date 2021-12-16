package com.serenity.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearch {

	public FlightSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}		 
	
	@FindBy(xpath = "//div[@data-cy='outsideModal']")
	WebElement closePopUp;
	
	@FindBy(xpath = "//li[@data-cy='roundTrip']")
	WebElement selectRoundTrip;
	
	@FindBy(xpath = "//span[contains(text(),'From')]")
	WebElement clickFrom;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement enterFrom;
	
	@FindBy(xpath = "//div[contains(text(),'PNQ')]")
	WebElement selectFrom;
		
	@FindBy(xpath = "//span[contains(text(),'To')]")
	WebElement clickTo;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement enterTo;	
	
	@FindBy(xpath = "//div[contains(text(),'BOM')]")
	WebElement selectTo;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	WebElement clickSearchButton;
	
	
	public void onewaysearch() {
		

		closePopUp.click();
		
		clickFrom.click();		
		enterFrom.sendKeys("Pune");
		selectFrom.click();
		
		clickTo.click();
		enterTo.sendKeys("Mumbai");
		selectTo.click();
		
		clickSearchButton.click();
		
	}
	
	public void roundTripsearch() {
		

		closePopUp.click();
		
		selectRoundTrip.click();
		
		clickFrom.click();		
		enterFrom.sendKeys("Pune");
		selectFrom.click();
		
		clickTo.click();
		enterTo.sendKeys("Mumbai");
		selectTo.click();
		
		clickSearchButton.click();
		
	}

}

