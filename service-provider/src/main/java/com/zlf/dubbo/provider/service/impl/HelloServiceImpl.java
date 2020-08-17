package com.zlf.dubbo.provider.service.impl;

import com.zlf.dubbo.api.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhanglifang
 * @date 2020/8/17
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("你好，世界");
    }

}