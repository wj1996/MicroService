package com.wj01.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")  //需要提供set方法
public class Quick3ontroller {


    private String name;
    private String addr;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("quick3")
    @ResponseBody
    public String quick2() {
        //获得配置文件的信息
        return name + "," + addr;
    }
}
