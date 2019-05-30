package com.wj01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {

    @RequestMapping("quick")
    @ResponseBody
    public String quick() {
        System.out.println(1);
        return "123 fsfsfsfsf45678 test";
    }
}
