package guru.componentScan.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Ger","de" +
        "fault"})
@Service("I18nService")
public class I18nGerman implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Guten tag world - Ger";
    }

    @Override
    public String getGreeting() {
        return  "Guten tag world2 - Ger";
    }
}
