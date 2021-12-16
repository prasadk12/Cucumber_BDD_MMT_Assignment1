package com.serenity.stepDefinitions;

import com.serenity.pages.FlightResults;
import com.serenity.pages.FlightSearch;

import base.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchStepDefinition extends SetUp {

	FlightSearch flightSearch = new FlightSearch(driver);
	FlightResults flightResults = new FlightResults(driver);

	@When("I perform one way search")
	public void i_perform_one_way_search(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		flightSearch.onewaysearch();
		System.out.println("One Way Trip Details Entered");

	}

	@Then("Search Result should display available flights for one way trip")
	public void search_result_should_display_available_flights_for_one_way_trip() {
		flightResults.flightsDisplayed();
		System.out.println("Available Flights Displayed for One Way Trip");
	}

	@When("I perform round trip search")
	public void i_perform_round_trip_search(io.cucumber.datatable.DataTable dataTable) {
		flightSearch.roundTripsearch();
		System.out.println("Round Trip Details Entered");

	}

	@Then("Search Result should display available flights for round trip")
	public void search_result_should_display_available_flights_for_round_trip() {
		flightResults.flightsDisplayed();
		System.out.println("Available Flights Displayed for Two Way Trip");

	}

}
