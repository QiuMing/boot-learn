package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Created by Ming on 2016/8/23.
 */
@RestController
@RequestMapping("/")
public class ResetController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private Environment env;

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    public String test() {
        return "Hello world";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String log() {
        logger.info("hello logger type={}", "info");
        logger.warn("hello logger type={}", "warn");
        logger.error("hello logger type={}", "error");
        logger.debug("hello logger type={}", "debug");
        return "Hello world";
    }


    @RequestMapping("/testProfile")
    public String testProfile() {
        return env.getProperty("profile");
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST)
    @ApiOperation(value = "测试接口", notes = "测试接口详细描述")
    public String show(
            @ApiParam(required = true, name = "name", value = "姓名")
            @RequestParam(name = "name") String stuName) {
        return "success";
    }
}
