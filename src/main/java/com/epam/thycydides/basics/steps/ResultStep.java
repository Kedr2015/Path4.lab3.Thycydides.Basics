package com.epam.thycydides.basics.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ResultStep extends ScenarioSteps {

	private static final long serialVersionUID = 7844601514736537394L;

	public ResultStep(Pages pages) {
		super(pages);
	}

	@Step
	public void GoodsNotHhigherMaxPrices(int max) {

	}

	@Step
	public void GoodsHhigherMaxPrices(int max) {

	}

}
