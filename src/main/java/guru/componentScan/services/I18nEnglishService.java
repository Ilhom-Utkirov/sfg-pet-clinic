package guru.componentScan.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("En")
@Service("I18nService")
public class I18nEnglishService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello world -- 1English";
    }

    @Override
    public String getGreeting() {
        return "Hello world -- 2English";
    }
}
