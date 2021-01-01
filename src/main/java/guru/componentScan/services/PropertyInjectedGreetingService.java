package guru.componentScan.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }

    @Override
    public String getGreeting() {
        return "Hello world - Property";
    }
    }

