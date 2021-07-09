package com.shoes.sort;

public class Sorter {
	String sortName;
	String sortType;
	
	public Sorter(String sortName, String sortType) {
		this.sortName = sortName;
		this.sortType = sortType;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	
}
