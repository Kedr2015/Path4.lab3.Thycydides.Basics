package com.epam.thycydides.basics.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.epam.thycydides.basics.bo.ProductSearch;
import com.epam.thycydides.basics.feature.Application;
import com.epam.thycydides.basics.steps.BaseSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

@RunWith(ThucydidesRunner.class)
@Story(Application.YandexMarket.SelectCategory.class)
public class CheckEmptySearchTest {

	private ProductSearch product = new ProductSearch("Электроника", "Мобильные телефоны", "1000");
	private final String URL = "http://market.yandex.ru";

	
	@Managed
	public WebDriver driver;

	@ManagedPages
	public Pages pages;

	@Steps
	public BaseSteps step;

	@Before
	public void openYandexMarket() {

		step.navigateTo(URL);
	}

	@After
	public void closeBrowser() {
		// Close Browser
		driver.close();

	}
	//Search results check
	@Test
	public void SelectCategoryPresentDataTest() {
		step.main.doFilter(product);
		step.filter.enterMaximumAmount(product.getMaxPrice());
		assertTrue(step.result.GoodsNotHhigherMaxPrices(product.getMaxPrice()));
	}
	//Check the empty search
	@Test
	public void SelectCategoryNoPresentDataTest() {
		step.main.doFilter(product);
		step.filter.enterMaximumAmount("30");
		assertTrue(step.result.GoodsHhigherMaxPrices());
	}

}
