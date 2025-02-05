package com.refDependencyInjection_with_Java;

public class Address {

	private String areaName;
	private String cityName;
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	
	
	
	
}
