package com.lazideveloperexception.controllers;

import com.lazideveloperexception.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayHello();
    }
}
