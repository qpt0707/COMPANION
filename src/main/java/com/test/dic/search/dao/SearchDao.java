package com.test.dic.search.dao;

import java.util.List;
import java.util.Map;

import com.test.dic.model.Search;

public interface SearchDao {
	public List<Search> listAll(String searchOption, String keyword);

}
