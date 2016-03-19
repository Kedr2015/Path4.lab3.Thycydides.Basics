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

	// item category Electronics
	@FindBy(xpath = ".//li/a[text() = 'Электроника']")
	private WebElement categoryElectronics;
	// item category Computer
	@FindBy(xpath = ".//li/a[text() = 'Компьютеры']")
	private WebElement categoryComputer;
	//item type Phones
	@FindBy(xpath = ".//li/div/div/a[text() = 'Мобильные телефоны']")
	private WebElement typePhones;
	//selection category Electronics
	public void selectCategoryElectronics() {
		categoryElectronics.click();
	}
	//selection category Computer
	public void selectCategoryComputer() {
		categoryComputer.click();
	}
	//selection type Phones
	public void selectTypePhones() {
		typePhones.click();
	}
}
