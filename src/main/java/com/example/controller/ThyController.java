package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ming on 2016/8/25.
 */
@Controller
public class ThyController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index ()
    {
        logger.info("this is first index");
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(ModelMap model){
        User user = new User();
        user.setName("name");
        user.setName("password");
        return "login";
    }

    class User{
        String name;
        String password;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
