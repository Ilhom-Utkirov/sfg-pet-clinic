package guru.componentScan.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
@Service
@Primary
@Profile("de")
*/

public class PrimaryGermanGreetingService implements GreetingServices {
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}