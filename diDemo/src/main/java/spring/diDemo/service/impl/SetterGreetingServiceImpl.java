package spring.diDemo.service.impl;

import org.springframework.stereotype.Service;
import spring.diDemo.service.GreetingService;
@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via setter!!";
    }
}
