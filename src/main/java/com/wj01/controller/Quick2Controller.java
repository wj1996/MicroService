package com.wj01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick2Controller {


    //@Value注解去获取配置文件的信息比较繁琐，如果值很多，就sb了
    @Value("${name}")
    private String name;

    @RequestMapping("quick2")
    @ResponseBody
    public String quick2() {
        //获得配置文件的信息
        return name;
    }
}
