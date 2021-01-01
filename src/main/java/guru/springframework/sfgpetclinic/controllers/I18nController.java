package guru.springframework.sfgpetclinic.controllers;

import guru.componentScan.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@ComponentScan(basePackages = {"guru.componentScan.services" , "guru.config" , "guru.springframework.sfgpetclinic"})
@Controller

public class I18nController {

    private final GreetingServices greetingServices;

    public I18nController(@Qualifier("I18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

     public String sayHello(){
        return greetingServices.sayGreeting();
     }
}
