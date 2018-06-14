package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.example.demo.domain.LoginInfo;
import com.example.demo.domain.Usr;
import com.example.demo.util.TokenUtil;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;

@RestController  
@RequestMapping("/user")
public class UsrController {
	@CrossOrigin(origins="*")//允许跨域请求  
    @RequestMapping(value="/login",method=RequestMethod.POST)  
    public JSONObject login(@RequestBody Map<String,String> map){  
		String username=map.get("username");
        String password=map.get("password");
        System.out.println(password);
		JSONObject r = new JSONObject();  
        if("admin".equals(username) && "123456".equals(password))   {  
            r.put("code", "200");  
            r.put("msg", "登录成功"); 
            r.put("tickname", "管理员");
            r.put("token", TokenUtil.getToken(username));  
        }else{  
            r.put("code", "500");  
            r.put("msg", "登录失败");  
        }  
        return r;  
    }
	
	@CrossOrigin(origins="*")//允许跨域请求  
    @RequestMapping(value="/getUserList",method=RequestMethod.POST)  
    public JSONObject getUserList(@RequestBody Map<String,String> m,HttpServletResponse response) throws IOException, InterruptedException{ 
		System.out.println(m.get("name"));
		String page=m.get("page");
		int start=0;
		if("0".equals(page)){
			start=0;
		}else if("1".equals(page)){
			start=21;
		}else{
			start=41;
		}
		List<Usr> list=new ArrayList<Usr>();
        for(int i=start;i<50;i++) {
        	Usr user=new Usr();
        	user.setId(String.valueOf(i));
        	
        	user.setName("张三"+i);
        	user.setAddress("湖北襄阳"+i);
        	if(i%2==0) {
        		user.setSex("0");
        	}else {
        		user.setSex("1");
        	}
        	user.setAge("23");
        	list.add(user);
        }
        Map map=new HashMap<>();
        map.put("total", list.size());
        map.put("users", list);
        String str=net.sf.json.JSONSerializer.toJSON(list).toString();
        JSONObject r = new JSONObject(); 
        r.put("data", map);
        return r;
    }
	
	@CrossOrigin(origins="*")//允许跨域请求  
    @RequestMapping(value="/removeUser",method=RequestMethod.POST)  
    public JSONObject removeUser(@RequestBody Map<String,String> m,HttpServletResponse response) throws IOException{ 
		System.out.println("ddd");
		System.out.println(m.get("id"));
        JSONObject r = new JSONObject(); 
        r.put("code", "200");
        return r;
    }
	
	
	@CrossOrigin(origins="*")//允许跨域请求  
    @RequestMapping(value="/getEdit",method=RequestMethod.POST)  
    public JSONObject getEdit(@RequestBody Map<String,String> m,HttpServletResponse response) throws IOException{ 
		System.out.println(m.get("id"));
		Map map=new HashMap<>();
    	Usr user=new Usr();
    	user.setId("44");
    	user.setName("李四");
    	user.setAddress("测试");
    	user.setAge("88");
        map.put("user", user);
        JSONObject r = new JSONObject(); 
        r.put("data", map);
        return r;
    }
	
	
	@CrossOrigin(origins="*")//允许跨域请求  
    @RequestMapping(value="/addUser",method=RequestMethod.POST)  
    public JSONObject addUser(@RequestBody Map<String,String> m,HttpServletResponse response) throws IOException{ 
		System.out.println(m.toString());
		Map map=new HashMap<>();
    	Usr user=new Usr();
    	user.setId("44");
    	user.setName("李四");
    	user.setAddress("测试");
    	user.setAge("88");
        map.put("user", user);
        JSONObject r = new JSONObject(); 
        r.put("data", map);
        return r;
    }
}
