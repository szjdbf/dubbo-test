package com.zlf.dubbo.consumer.controller;

import com.zlf.dubbo.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanglifang
 * @date 2020/8/17
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/sayHello")
    public void sayHello() {
        helloService.sayHello();
    }

}