package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingServices greetingServices;


    public String getGreeting(){
        return greetingServices.sayGreeting();
    }

}
