package com.shoes.paging;

import com.shoes.sort.Sorter;

public interface Pageble {
	Integer getOffset();
	Integer getLimit();
	Sorter sorter();
}
