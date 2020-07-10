package com.etsy.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etsy.resources.FunctionalLibrary;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(id = "search-query")
	private WebElement txt_searchBox;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement btn_search;

	public WebElement getTxt_searchBox() {
		return txt_searchBox;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

}
