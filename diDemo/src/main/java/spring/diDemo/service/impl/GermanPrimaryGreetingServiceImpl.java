package spring.diDemo.service.impl;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.diDemo.Repository.GreetingRepository;
import spring.diDemo.service.GreetingService;


public class GermanPrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanPrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
