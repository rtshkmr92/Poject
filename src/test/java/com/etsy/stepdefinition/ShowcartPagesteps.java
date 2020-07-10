package com.etsy.stepdefinition;

import org.junit.Assert;

import com.etsy.objectrepository.ShowCartPage;
import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;

public class ShowcartPagesteps extends FunctionalLibrary {

	@Then("The user should see the item added to the cart")
	public void the_user_should_see_the_item_added_to_the_cart() {
		ShowCartPage cart = new ShowCartPage();
		waitForElementVisibility(cart.getLbl_count());
		Assert.assertEquals("1", cart.getLbl_count().getText());
	}
}
