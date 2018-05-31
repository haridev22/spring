package spring.diDemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import spring.diDemo.service.impl.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setup(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());

    }
}
