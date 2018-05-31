package spring.diDemo.controller;

import org.springframework.stereotype.Component;
import spring.diDemo.service.GreetingService;

@Component
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
//        System.out.println("hello");
        return greetingService.sayGreeting();
    }
}
