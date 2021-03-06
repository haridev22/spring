package spring.diDemo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.diDemo.service.GreetingService;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via Primary!!";
    }
}
