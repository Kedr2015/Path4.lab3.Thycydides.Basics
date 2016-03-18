package com.epam.thycydides.basics.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.epam.thycydides.basics.bo.ProductSearch;
import com.epam.thycydides.basics.feature.Application;
import com.epam.thycydides.basics.steps.BaseSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

@RunWith(ThucydidesRunner.class)
@Story(Application.YandexMarket.SelectCategoryNotebooks.class)
public class SelectCategoryNotebooksTest {

	private final String URL = "http://market.yandex.ru";
	private final ProductSearch product = new ProductSearch("Ноутбуки","Компьютеры","Ноутбуки",30);
	@Managed
	public WebDriver driver;

	@ManagedPages
	public Pages pages;
	
	@Steps
	public BaseSteps step;
	
	@Before
	public void openYandexMarket(){
		step.navigateTo(URL);
	}
	
	@Test
	@Pending
	public void SelectCategoryTest(){
		step.main.doFilter(product);
	}

}
