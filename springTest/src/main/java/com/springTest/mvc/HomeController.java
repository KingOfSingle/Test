package com.springTest.mvc;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springTest.mapper.Test;

import beans.SjCmCode;
import beans.TestBoard;
import dao.TestDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String testdd(Model model) throws SQLException {
		Test t= new Test();
		/* t.insert_code("aaa", "bbb"); */
		ArrayList<SjCmCode> result = t.open("asd");
		model.addAttribute("result", result);
		return "home";
	}
	
	/*
	 * @RequestMapping(value = "/aaa", method = RequestMethod.GET) public String
	 * home(Model model) { TestDao testDao = sqlSession.getMapper(TestDao.class);
	 * ArrayList<TestBoard> items = testDao.getTestBoardList();
	 * model.addAttribute("items",items);
	 * 
	 * return "home"; }
	 */
	
}
