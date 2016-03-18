package com.epam.thycydides.basics.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

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
@Story(Application.YandexMarket.SelectCategoryTelevisions.class)
public class SelectCategoryTelevisionsTest {

	@Managed
	public WebDriver driver;

	@ManagedPages
	public Pages pages;
	
	@Steps
	public BaseSteps step;
	
	@Test
	@Pending
	public void FilterTheResults(){
		
	}
}
