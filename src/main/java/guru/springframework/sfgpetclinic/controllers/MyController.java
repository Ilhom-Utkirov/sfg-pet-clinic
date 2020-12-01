package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.GreetingServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }


    public String sayHello(){
       // System.out.println("Hello world");
        //return "hi to everyone";
        return greetingServices.sayGreeting();
    }

}
