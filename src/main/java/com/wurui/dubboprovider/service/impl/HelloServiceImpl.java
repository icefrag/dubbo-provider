package com.wurui.dubboprovider.service.impl;

import com.wurui.dubboprovider.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: wurui
 * @create: 2019-03-10 16:20
 **/
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String word) {
        return "hello:" + word;
    }
}
