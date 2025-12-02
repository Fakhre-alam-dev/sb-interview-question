package mfa.codecurve.interviewquestion.propertSources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySources {
    @Autowired
    private Environment environment;

    @Value("${user.email}")
    private String username;
    @Value("${user.email.password}")
    private String password;


    private String host;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return environment.getProperty(("smtp.host"));
    }
}
