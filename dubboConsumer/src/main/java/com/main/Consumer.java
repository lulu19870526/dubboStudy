package com.main;

import com.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *service不在一个项目中，只能打成jar包依赖
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"/config/applicationContextConsumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("tom");
        System.out.println(hello);

        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
