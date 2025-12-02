package mfa.codecurve.interviewquestion.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValuedAnnotation {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${user.name}")
    private String username;
    @Value("${user.password}")
    private String password;
    @Value("${user.url}")
    private String url;
    @Value("alam.it.tech@gmail.com")
    private String email;
    @Value("01712345678")
    private String phone;
    @Value("Delhi India")
    private String address;
    @Value("${JAVA_HOME}")
    private String homeDirectory;

    public String getAppName() {
        return appName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeDirectory() {
        return homeDirectory;
    }
}
