package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Edvard Piri on 26.03.2017.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public ModelAndView Test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.vm");
        return modelAndView;
    }
}
