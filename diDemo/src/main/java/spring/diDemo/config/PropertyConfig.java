package spring.diDemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import spring.diDemo.exampleBeans.FakeDataSource;
import spring.diDemo.exampleBeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${spring.user}")
    String user;
    @Value("${spring.pass}")
    String pass;
    @Value("${spring.url}")
    String url;
    @Value("${jms.user}")
    String juser;
    @Value("${jms.pass}")
    String jpass;
    @Value("${jms.url}")
    String jurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        return new FakeDataSource(user,pass,url);
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        return new FakeJmsBroker(juser,jpass,jurl);
    }



//    @Bean
//    public static PropertySourcesPlaceholderConfigurer property(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }


}
