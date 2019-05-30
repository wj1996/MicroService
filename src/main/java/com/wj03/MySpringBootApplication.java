package com.wj03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该类是一个springboot的引导类
@SpringBootApplication   //springboot引导类
public class MySpringBootApplication {

    public static void main(String[] args) {
        //运行SpringBoot的引导类，run参数就是SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
