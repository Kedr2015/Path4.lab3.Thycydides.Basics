package com.epam.thycydides.basics.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class ResultPage extends PageObject {

	public ResultPage(WebDriver driver) {
		super(driver);
	}
	//price on the results page
	@FindBy(xpath = ".//*[@id='gf-priceto-var']")
	public WebElement price;
	
	//of empty results message
	public By emptySearch = By.xpath(".//div[@class='serp-empty__wrapper']/h");
	
	// the highest price on the results page
	public String selectMaxPrice() {
		return price.getText();
	}

}
