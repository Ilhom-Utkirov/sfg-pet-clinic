package guru.springframework.sfgpetclinic.controllers;

import guru.componentScan.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new ConstructorGreetingServicesImpl();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}