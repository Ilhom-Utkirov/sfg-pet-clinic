package guru.springframework.sfgpetclinic.controllers;

import guru.componentScan.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingServices greetingServices;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.getGreeting();
    }

    public String sayGreeting(){
        return greetingServices.sayGreeting();
    }


}
