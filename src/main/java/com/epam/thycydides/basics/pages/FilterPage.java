package com.epam.thycydides.basics.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class FilterPage extends PageObject {

	public FilterPage(WebDriver driver) {
		super(driver);
	}
	//element to enter the maximum price for your search
	@FindBy(xpath = ".//tr[@valign='top'][2]/td[2]/input[3]")
	public WebElement fieldMaximumPrices;
	//search button
	@FindBy(xpath = ".//input[@value='Подобрать']")
	public WebElement buttonSelection;
	
}
