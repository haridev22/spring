package spring.diDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.diDemo.service.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
