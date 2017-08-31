package com.test.dic.search.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.dic.model.Search;
import com.test.dic.search.dao.SearchDao;
import com.test.dic.search.service.SearchService;


@Controller
public class SearchController {
	@Resource(name="searchService")
	private SearchService searchService;
	
	@RequestMapping(value="/search/{list.do}")
    public ModelAndView list(@RequestParam(defaultValue="eng") String searchOption,
    		@RequestParam(defaultValue="") String keyword){
        List<Search> list=searchService.listAll(searchOption, keyword);
       
        ModelAndView mav = new ModelAndView();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("keyField", searchOption);
        map.put("keyWord", keyword);
        mav.addObject("map",map);
        mav.setViewName("search/list");
        
        
        ModelAndView mav = new ModelAndView();
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("keyField", searchOption);
        map.put("keyWord", keyword);
        mav.addObject("map",map);
        mav.setViewName("search/list");
        
        return mav;
    }
}