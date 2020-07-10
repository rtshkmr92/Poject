package com.etsy.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etsy.resources.FunctionalLibrary;

public class ListingPage {
	
	public ListingPage(){
		PageFactory.initElements(FunctionalLibrary.driver, this);
		
	}
	@FindBy(id="inventory-variation-select-0")
	private WebElement drpDwn_colours;
	
	@FindBy(id="inventory-variation-select-1")
	private WebElement drpDwn_size;
	
	@FindBy(id="inventory-variation-select-quantity")
	private WebElement drpdwn_quantity;
	
	@FindBy(xpath="//div[text()='Add to basket']")
	private WebElement btn_addToCart;

	public WebElement getDrpDwn_colours() {
		return drpDwn_colours;
	}

	public WebElement getDrpDwn_size() {
		return drpDwn_size;
	}

	public WebElement getDrpdwn_quantity() {
		return drpdwn_quantity;
	}

	public WebElement getBtn_addToCart() {
		return btn_addToCart;
	}
	
	

}
