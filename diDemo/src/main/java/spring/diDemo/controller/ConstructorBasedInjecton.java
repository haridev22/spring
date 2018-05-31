package spring.diDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.diDemo.service.GreetingService;
import spring.diDemo.service.impl.ConstructorGreetingServicesImpl;

@Controller
public class ConstructorBasedInjecton {

    private GreetingService greetingService;

    @Autowired
    public ConstructorBasedInjecton(@Qualifier("constructorGreetingServicesImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
