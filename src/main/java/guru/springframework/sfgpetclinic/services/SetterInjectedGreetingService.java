package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello world !! - Setter Injection";
    }

    @Override
    public String getGreeting() {
        return  "Hello world !! - Setter Injection";
    }
}
