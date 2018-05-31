package spring.diDemo.service.impl;

import org.springframework.stereotype.Service;
import spring.diDemo.service.GreetingService;

@Service
public class ConstructorGreetingServicesImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via Constructor!!";
    }
}
