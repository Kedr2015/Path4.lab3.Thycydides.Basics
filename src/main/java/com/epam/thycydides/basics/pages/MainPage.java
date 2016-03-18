package com.epam.thycydides.basics.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

@At("https://market.yandex.ru/")
public class MainPage extends PageObject {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="")
	private WebElement test;
}
