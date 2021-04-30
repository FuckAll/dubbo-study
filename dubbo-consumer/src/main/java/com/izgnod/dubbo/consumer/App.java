package com.izgnod.dubbo.consumer;

import com.izgnod.dubbo.api.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: izgnod.
 * @date: 2021/4/30
 * @description:
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        String str = providerService.sayHello("hello");
        System.out.println(str);
        System.in.read();

    }
}