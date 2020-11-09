package com.test.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class TestController {

    @RequestMapping(value = "/getAA", method = RequestMethod.GET)
    public String getA(HttpServletRequest request) {
        System.out.println(JSON.toJSONString(request.getRemoteHost()));
        System.out.println(JSON.toJSONString(request.getRemoteHost()));
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("remoteAddr",request.getRemoteAddr());
        returnMap.put("forwarded", request.getHeader("X-Forwarded-For"));
        System.out.println("AA"+JSONObject.toJSONString(returnMap));
        return "getAA success test:"+JSONObject.toJSONString(returnMap);
    }

    @RequestMapping(value = "/getBB", method = RequestMethod.GET)
    public String getB(HttpServletRequest request) {
        return "getBB success test:"+request.getRemoteAddr();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String GetAll(HttpServletRequest request) {
        return "GetAll:"+request.getRemoteAddr();
    }

}
