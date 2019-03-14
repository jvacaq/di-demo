package com.lazideveloperexception.controllers;

import com.lazideveloperexception.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHelloTest() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, this.setterInjectedController.sayHello());
    }
}