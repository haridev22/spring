package spring.diDemo.service.impl;

import org.springframework.stereotype.Service;
import spring.diDemo.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS="Hello Gurus!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
