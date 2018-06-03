package spring.diDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spring.diDemo.exampleBeans.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${spring.user}")
    String user;
    @Value("${spring.pass}")
    String pass;
    @Value("${spring.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        return new FakeDataSource(user,pass,url);
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer property(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }


}
