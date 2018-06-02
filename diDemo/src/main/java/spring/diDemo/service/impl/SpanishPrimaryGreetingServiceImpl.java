package spring.diDemo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.diDemo.Repository.GreetingRepository;
import spring.diDemo.service.GreetingService;


public class SpanishPrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public SpanishPrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
