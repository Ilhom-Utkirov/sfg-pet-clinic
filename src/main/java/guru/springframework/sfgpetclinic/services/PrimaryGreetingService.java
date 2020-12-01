package guru.springframework.sfgpetclinic.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingServices{


    @Override
    public String sayGreeting() {
        return "Hello world -from PRIMARY beans";
    }

    @Override
    public String getGreeting() {
        return "Hello world - from PRIMARY beans";
    }
}
