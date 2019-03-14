package com.lazideveloperexception.controllers;

import com.lazideveloperexception.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHelloTest() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, this.propertyInjectedController.sayHello());
    }
}