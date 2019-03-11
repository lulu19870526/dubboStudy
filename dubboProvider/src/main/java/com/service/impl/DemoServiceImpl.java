package com.service.impl;


import com.api.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
