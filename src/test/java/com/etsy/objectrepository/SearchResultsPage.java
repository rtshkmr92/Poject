package com.etsy.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etsy.resources.FunctionalLibrary;

public class SearchResultsPage {

	public SearchResultsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//h2[contains(text(),'Search results')]//parent::div//ul/li")
	private List<WebElement> lnk_searchResults;

	public List<WebElement> getLnk_searchResults() {
		return lnk_searchResults;
	}

}
