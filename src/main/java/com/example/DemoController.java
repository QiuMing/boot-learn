package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Ming on 2016/8/23.
 */
@RestController
@RequestMapping("/")
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private Environment env;

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public String test(){
        return "Hello world,明名名米国";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String log(){
        logger.info("hello logger type={}","info");
        logger.warn("hello logger type={}","warn");
        logger.error("hello logger type={}","error");
        logger.debug("hello logger type={}","debug");
        return "Hello world";
    }


    @RequestMapping("/testProfile")
    public String testProfile(){
        return env.getProperty("profile");
    }

}
