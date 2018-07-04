package com.mer.dto.filter;

import java.io.Serializable;

public class FilterDTO implements Serializable {
	
	private int id;
	private String catagorey;
	private double maxPrice;
	private double minPrice;
	private String scope;
	private String province;
	
	public FilterDTO() {
	}
	
	public FilterDTO(int id, String catagorey, double maxPrice, double minPrice, String scope, String province) {
		super();
		this.id = id;
		this.catagorey = catagorey;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
		this.scope = scope;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatagorey() {
		return catagorey;
	}

	public void setCatagorey(String catagorey) {
		this.catagorey = catagorey;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "FilterDTO [id=" + id + ", catagorey=" + catagorey + ", maxPrice=" + maxPrice + ", minPrice=" + minPrice
				+ ", scope=" + scope + ", province=" + province + "]";
	}
	
	

}
