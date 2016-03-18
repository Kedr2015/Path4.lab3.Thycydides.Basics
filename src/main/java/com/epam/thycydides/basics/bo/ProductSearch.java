package com.epam.thycydides.basics.bo;

public class ProductSearch {
	private String titleGoods;
	private String name;
	private String category;
	private int maxPrice;

	public ProductSearch(String titleGoods, String name, String category, int maxPrice) {
		this.titleGoods = titleGoods;
		this.name = name;
		this.category = category;
		this.maxPrice = maxPrice;
	}

	public String getTitleGoods() {
		return titleGoods;
	}

	public void setTitleGoods(String titleGoods) {
		this.titleGoods = titleGoods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

}
