package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Autowired Jwt JWt;
	@RequestMapping(value="Get",method=RequestMethod.GET)
	public Map<String,Object> getData()
	{
		try {
		Map<String,Object>map=new HashMap<String,Object>(3);
		
		String sql="SELECT id, age FROM \"Student\"";
		List<Map<String,Object>>list=jdbctemplate.queryForList(sql);
		map.put("status","success");
		map.put("data",list);
		return map;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return new HashMap<String,Object>(0);
		
	}
	
	@RequestMapping(value="/api/login",method=RequestMethod.GET)
	public Map<String,Object> getData1(@RequestParam String username,@RequestParam String password)
	{
		
		Map<String,Object>map=new HashMap<String,Object>(6);
		map.put("token",JWt.generateToken(username));
		return map;
		
	}
	
	@RequestMapping(value="Save",method=RequestMethod.GET)
	public Map<String,Object>saveData(@RequestBody Map<String,Object>map)
	{
		return map;
		
	}
	

}