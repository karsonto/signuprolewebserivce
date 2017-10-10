package com.karson.webmagic.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karson.webmagic.dao.Common;
import com.karson.webmagic.dao.SignupRule;
import com.karson.webmagic.dao.SignupRuleDao;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

 
 
@RestController
@RequestMapping("/siguprule")
public class IndexController { 
	
	@Autowired
	private SignupRuleDao signupRuleDao;
	@ApiOperation(value="获取SignupRule Page", notes="")
	@RequestMapping(value = "/getbypage", method = RequestMethod.GET)
 public Page<SignupRule> get(@RequestParam(value="query",defaultValue = "")String query,@RequestParam(value="currentPage",defaultValue ="1")Integer currentPage,Integer pageSize){
	
	 if(currentPage==0) {
		 currentPage = 1;
	 }
	 if(pageSize==null) {
		pageSize = Common.pageSize;
	 }
	 
    System.out.println(query);
	PageRequest pageable =new PageRequest(currentPage-1, pageSize);
	Page<SignupRule> page = signupRuleDao.findBypageAndQuery(query, pageable);
	return page;
	
	 
 }
	
	 @ApiOperation(value="获取SignupRule", notes="根据SignupRule id 获取")
	@RequestMapping(value = "/getbysamecarrier", method = RequestMethod.GET)
	public List<SignupRule> getbyid(@RequestParam(value="id",defaultValue = "")String id) {
		SignupRule	signupRule =signupRuleDao.findOne(id);
		return  signupRuleDao.findByCarrier(signupRule.getCarrier());
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String  getdeletebyid(String id) {
		signupRuleDao.delete(id);
		 return "success";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public SignupRule  addsignuprule(@RequestBody  SignupRule signupRule) {
		signupRule.setId(null);
		signupRule.setCreatedTimestamp(System.currentTimeMillis());
		signupRule.setUpdatedTimestamp(System.currentTimeMillis());
	//	signupRule = signupRuleDao.save(signupRule);
		signupRule = signupRuleDao.save(signupRule);
		 return signupRule;
	}

}
