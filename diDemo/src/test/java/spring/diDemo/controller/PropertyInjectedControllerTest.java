package spring.diDemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import spring.diDemo.service.impl.GreetingServiceImpl;


public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }
    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());

    }
}
