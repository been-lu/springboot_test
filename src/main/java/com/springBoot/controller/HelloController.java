package com.springBoot.controller;

import com.springBoot.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan(basePackages = {"com.springBoot.pojo"})
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(msg1);
        System.out.println(msg2);

        System.out.println("-----------------------------------");

        System.out.println(environment.getProperty("name"));

        System.out.println("-----------------------------------");

        System.out.println(person);

        return "hello springboot";
    }

    @Value("${person.name}")
    private  String name;

    @Value("${address[1]}")
    private String address;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment environment;

    @Autowired
    private Person person;
}
