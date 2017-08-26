package com.test.dic.search.service;

import java.util.List;
import java.util.Map;

import com.test.dic.model.Search;

public interface SearchService {
	public List<Search> listAll(String searchOption, String keyWord);

}
