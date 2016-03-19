package com.epam.thycydides.basics.bo;

/**
 * @author kedr
 * 
 *         Business object that contains the data to search
 */
public class ProductSearch {
	private String type;
	private String category;
	private String maxPrice;

	public ProductSearch(String name, String category, String maxPrice) {
		this.type = name;
		this.category = category;
		this.maxPrice = maxPrice;
	}

	public String getName() {
		return type;
	}

	public void setName(String name) {
		this.type = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

}
