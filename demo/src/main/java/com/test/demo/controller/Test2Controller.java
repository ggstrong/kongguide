package com.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test2")
public class Test2Controller {
    @RequestMapping(value = "/getA", method = RequestMethod.GET)
    public String getA(HttpServletRequest request) {
        return "getA success demo"+request.getRemoteAddr();
    }

    @RequestMapping(value = "/getB", method = RequestMethod.GET)
    public String getB(HttpServletRequest request) {
        return "getB success demo"+request.getRemoteAddr();
    }

}
