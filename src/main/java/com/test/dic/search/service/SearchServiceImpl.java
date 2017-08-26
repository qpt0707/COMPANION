package com.test.dic.search.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dic.model.Search;
import com.test.dic.search.dao.SearchDao;

@Service("searchService")
public class SearchServiceImpl implements SearchService{
	@Autowired
	private SearchDao searchDao;
	
	@Override
    public List<Search> listAll(String searchOption, String keyWord){
        return searchDao.listAll(searchOption, keyWord);
    }
}
