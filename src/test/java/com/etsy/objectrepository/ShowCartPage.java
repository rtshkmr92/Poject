package com.etsy.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.etsy.resources.FunctionalLibrary;

public class ShowCartPage {
	
	public ShowCartPage(){
		PageFactory.initElements(FunctionalLibrary.driver, this);
		
	}

	@FindBy(xpath = "//span[@class='count ']")
	private WebElement lbl_count;

	public WebElement getLbl_count() {
		return lbl_count;
	}
	
	

}
