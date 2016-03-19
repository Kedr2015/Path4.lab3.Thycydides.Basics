package com.epam.thycydides.basics.steps;

import com.epam.thycydides.basics.bo.ProductSearch;
import com.epam.thycydides.basics.pages.MainPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MainStep extends ScenarioSteps {

	private static final long serialVersionUID = -3529011212234443446L;

	public MainStep(Pages pages) {
		super(pages);
	}

	private MainPage onMainPage() {
		return pages().get(MainPage.class);
	}

	@Step
	public boolean checkMainPage() {
		return false;
	}

	// choice of category and type
	@StepGroup
	public void doFilter(ProductSearch product) {
		switch (product.getCategory()) {
		case "Электроника":
			onMainPage().selectCategoryElectronics();
		case "Компьютеры":
			onMainPage().selectCategoryComputer();
		}
		switch (product.getName()) {
		case "Мобильные телефоны":
			onMainPage().selectTypePhones();
		}
	}
}
