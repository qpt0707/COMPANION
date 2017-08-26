package com.test.dic.search.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dic.model.Search;

@Repository("searchDao")
public class SearchDaoImpl implements SearchDao{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Search> listAll(String searchOption, String keyword) {
		Map<String, String> map = new HashMap<String, String>();
	    map.put("searchOption", searchOption);
	    map.put("keyword", keyword);
	    
		return sqlSession.selectList("dic.mybatis.Member.mySelectAll", map);
	}

}
