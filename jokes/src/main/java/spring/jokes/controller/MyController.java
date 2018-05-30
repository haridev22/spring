package spring.jokes.controller;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String hello(){
        System.out.println("hello");
        return "foo";
    }
}
