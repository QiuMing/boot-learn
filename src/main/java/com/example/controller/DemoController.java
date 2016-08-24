package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ming on 2016/8/23.
 */
@Controller
@RequestMapping("/api")
public class DemoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "Hello world,明名名米国";
    }


}
