package spring.diDemo.service;

import spring.diDemo.Repository.GreetingRepository;
import spring.diDemo.service.impl.GermanPrimaryGreetingServiceImpl;
import spring.diDemo.service.impl.PrimaryGreetingServiceImpl;
import spring.diDemo.service.impl.SpanishPrimaryGreetingServiceImpl;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingServiceImpl(greetingRepository);
            case "es":
                return new SpanishPrimaryGreetingServiceImpl(greetingRepository);
            case "de":
                return new GermanPrimaryGreetingServiceImpl(greetingRepository);
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);
        }
    }
}
