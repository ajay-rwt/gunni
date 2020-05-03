package ajayvikka.projects.gunni;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import ajayvikka.projects.gunni.model.Name;

@ConfigurationProperties(prefix = "pcc")
public class PropertyConfiguredClass {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}
