package ajayvikka.projects.gunni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PropertyConfiguredClass.class)
public class AlternateConfig {

    @Autowired
    private PropertyConfiguredClass propertyConfiguredClass;

    public void displayName() {
        System.out.println("**************************firstName : "+propertyConfiguredClass.getName().getFirstName());
        System.out.println("**************************middleName : "+propertyConfiguredClass.getName().getMiddleName());
        System.out.println("**************************lastName : "+propertyConfiguredClass.getName().getLastName());
    }

}
