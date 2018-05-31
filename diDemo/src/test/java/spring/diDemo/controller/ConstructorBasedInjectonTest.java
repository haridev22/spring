package spring.diDemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import spring.diDemo.service.impl.GreetingServiceImpl;

public class ConstructorBasedInjectonTest {
    private ConstructorBasedInjecton propertyInjectedController;

    @Before
    public void setup(){
        this.propertyInjectedController = new ConstructorBasedInjecton(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());

    }
}
