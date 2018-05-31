package spring.diDemo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.diDemo.service.GreetingService;

@Service
@Primary
@Profile("es")
public class SpanishPrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - Me inyectaron a través de Primary";
    }
}
