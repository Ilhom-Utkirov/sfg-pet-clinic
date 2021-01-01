package guru.springframework.sfgpetclinic.controllers;

import guru.componentScan.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingServices greetingServices;
    //@Autowired

    public ConstructorInjectedController(@Qualifier("constructorGreetingServicesImpl") GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }

}
