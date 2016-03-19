package com.epam.thycydides.basics.steps;

import java.util.NoSuchElementException;

import com.epam.thycydides.basics.pages.ResultPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class ResultStep extends ScenarioSteps {

	private static final long serialVersionUID = 7844601514736537394L;

	public ResultStep(Pages pages) {
		super(pages);
	}

	private ResultPage onResultStep() {
		return pages().get(ResultPage.class);
	}

	// check price on the result page
	@Step
	public boolean GoodsNotHhigherMaxPrices(String max) {
		String tempText = onResultStep().selectMaxPrice();
		return tempText.equals(max);
	}

	// blank check posts
	@Step
	public boolean GoodsHhigherMaxPrices() {
		try {
			return getDriver().findElement(onResultStep().emptySearch).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}

	}

}
