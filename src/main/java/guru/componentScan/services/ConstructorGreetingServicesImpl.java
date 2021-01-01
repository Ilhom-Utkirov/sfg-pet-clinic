package guru.componentScan.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello world!- Constructor";
    }

    @Override
    public String getGreeting() {
        return "Hi guys!!!";
    }
}
