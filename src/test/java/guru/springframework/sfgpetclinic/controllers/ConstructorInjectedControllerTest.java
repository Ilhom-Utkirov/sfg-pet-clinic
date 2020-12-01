package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;



    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}