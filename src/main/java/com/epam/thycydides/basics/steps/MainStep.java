package com.epam.thycydides.basics.steps;

import com.epam.thycydides.basics.bo.ProductSearch;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MainStep extends ScenarioSteps {

	private static final long serialVersionUID = -3529011212234443446L;

	public MainStep(Pages pages) {
		super(pages);
	}

	@Step
	public void selectCategory(String category) {

	}

	@Step
	public void selectType(String type) {

	}

	@Step
	public boolean checkMainPage() {
		return false;
	}

	@StepGroup
	public void doFilter(ProductSearch product) {
		selectCategory(product.getCategory());
		selectType(product.getName());
	}
}
