package spring.diDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.diDemo.service.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
//        System.out.println("hello");
        return greetingService.sayGreeting();
    }

    @RequestMapping("hi")
    public String getGreeting(Model model) {
        model.addAttribute("hi",greetingService.sayGreeting());
        return "greetingsPage";
    }
}
