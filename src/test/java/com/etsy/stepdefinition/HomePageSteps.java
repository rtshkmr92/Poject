package com.etsy.stepdefinition;

import com.etsy.objectrepository.HomePage;
import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

	@When("The user search for {string}")
	public void y(String searchString) {
		HomePage home = new HomePage();
		setText(home.getTxt_searchBox(), searchString);
		click(home.getBtn_search());

	}
}
