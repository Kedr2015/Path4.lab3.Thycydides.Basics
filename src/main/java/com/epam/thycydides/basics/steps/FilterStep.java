package com.epam.thycydides.basics.steps;

import com.epam.thycydides.basics.pages.FilterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class FilterStep extends ScenarioSteps {

	private static final long serialVersionUID = -8257608052273233897L;

	public FilterStep(Pages pages) {
		super(pages);
	}

	private FilterPage onFilterPage() {
		return pages().get(FilterPage.class);
	}
	//Search Engine Information waters
	@Step
	public void enterMaximumAmount(String max) {
		onFilterPage().fieldMaximumPrices.sendKeys(max);;
	}
	//Search Engine Information waters
	@Step
	public void pushButton() {
		onFilterPage().buttonSelection.click();
	}
}
