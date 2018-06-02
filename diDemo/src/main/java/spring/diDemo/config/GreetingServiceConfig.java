package spring.diDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import spring.diDemo.Repository.GreetingRepository;
import spring.diDemo.service.GreetingService;
import spring.diDemo.service.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService getPrimaryGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService getSpanishGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService getGremanGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("de");
    }
}
