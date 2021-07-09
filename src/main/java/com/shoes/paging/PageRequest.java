package com.shoes.paging;

import com.shoes.sort.Sorter;

public class PageRequest implements Pageble {

	Integer page;
	Integer maxPageItem;
	Sorter sorter;
	
	
	public PageRequest(Integer page, Integer maxPageItem, Sorter sorter) {
		this.page = page;
		this.maxPageItem = maxPageItem;
		this.sorter = sorter;
	}

	@Override
	public Integer getOffset() {
		return (this.page - 1) * this.maxPageItem;
	}

	@Override
	public Integer getLimit() {
		return this.maxPageItem;
	}

	@Override
	public Sorter sorter() {
		return this.sorter;
	}


}
