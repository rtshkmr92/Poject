package com.etsy.stepdefinition;

import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class Commonsteps extends FunctionalLibrary{

	@Given("The user is in etsy home page")
	public void x() {
	   driver.get("https://www.etsy.com/");
	}
}
