package com.epam.thycydides.basics.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

	private static final long serialVersionUID = -4972265050166725637L;

	public BaseSteps(Pages pages) {
		super(pages);
	}

	@Steps
	public FilterStep filter;

	@Steps
	public MainStep main;

	@Steps
	public ResultStep result;

	@Step
	public void navigateTo(String URl) {

	}
}
