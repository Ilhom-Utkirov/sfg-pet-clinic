package guru.componentScan.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
/*
@Primary
@Service
@Profile({"en","default"})

 */
public class PrimaryGreetingService implements GreetingServices{



    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }


/*
    @Override
    public String sayGreeting() {
        return "Hello world -from PRIMARY beans";
    }
    */


    @Override
    public String getGreeting() {
        return "Hello world - from PRIMARY beans";
    }
}
