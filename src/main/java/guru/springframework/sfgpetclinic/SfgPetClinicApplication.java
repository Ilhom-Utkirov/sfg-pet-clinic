package guru.springframework.sfgpetclinic;

import com.sun.glass.ui.Application;
import guru.springframework.sfgpetclinic.controllers.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.componentScan.services" , "guru.config" , "guru.springframework.sfgpetclinic"})
public class SfgPetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(SfgPetClinicApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

//commented in the lesson 37
        //System.out.println(myController.sayHello());
        System.out.println("------------------------from Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-------------------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------------Setter based Controller----------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController" );
        System.out.println(setterInjectedController.sayGreeting());

        System.out.println("---------------Constructor based - ------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(("constructorInjectedController"));
        System.out.println(constructorInjectedController.getGreeting());




    }

}
