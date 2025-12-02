package mfa.codecurve.interviewquestion.configurationpropeties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppPropertiesDemo {

    private AppProperties appProperties;

    @Autowired
    public AppPropertiesDemo(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    public void displayInfo() {
        System.out.println("App Name: " + appProperties.getName());
        System.out.println("App Version: " + appProperties.getVersion());
        System.out.println("App Description: " + appProperties.getDescription());
        System.out.println("App Upload Directory: " + appProperties.getUploadDir());
        System.out.println("Security Username: " + appProperties.getSecurity().getUsername());
        System.out.println("Security Password: " + appProperties.getSecurity().getPassword());
        System.out.println("Security Roles: " + appProperties.getSecurity().getRoles());
        System.out.println("Security Enabled: " + appProperties.getSecurity().isEnabled());
        System.out.println("Security Permissions: " + appProperties.getSecurity().getPermissions());
    }
}
