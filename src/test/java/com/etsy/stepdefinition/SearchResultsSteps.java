package com.etsy.stepdefinition;

import com.etsy.objectrepository.SearchResultsPage;
import com.etsy.resources.FunctionalLibrary;

import cucumber.api.java.en.When;

public class SearchResultsSteps extends FunctionalLibrary{

	@When("The user selects to add an item from search result")
	public void the_user_selects_to_add_an_item_from_search_result() {
		SearchResultsPage searchresult = new SearchResultsPage();
		click(searchresult.getLnk_searchResults().get(0));
	}
}
