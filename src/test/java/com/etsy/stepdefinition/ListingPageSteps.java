package com.etsy.stepdefinition;

import com.etsy.objectrepository.ListingPage;
import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListingPageSteps extends FunctionalLibrary {

	@When("The user selects the colour, size and quantity")
	public void the_user_selects_the_colour_size_and_quantity() {
		ListingPage listing = new ListingPage();
		switchToWindow();
		waitForElementClickable(listing.getDrpDwn_colours());
		selectByIndex(listing.getDrpDwn_colours(), 1);
		waitForElementClickable(listing.getDrpDwn_size());
		selectByIndex(listing.getDrpDwn_size(), 1);
		selectByIndex(listing.getDrpdwn_quantity(), 1);
	}

	@When("The user clicks the add to cart button")
	public void the_user_clicks_the_add_to_cart_button() throws InterruptedException {
		ListingPage listing = new ListingPage();
		waitForElementClickable(listing.getBtn_addToCart());
		clickjs(listing.getBtn_addToCart());
	}

	@Then("The user should see the error message")
	public void the_user_should_see_the_error_message() {
		System.out.println("implementatin is done");
	}
}
