package mfa.codecurve.interviewquestion.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataSourceImpl implements DataSource{
    String[] emails ={
            "abc@gmail.com", "alam@gmail.com"
    };

    @Override
    public String[] getEmails() {
        return emails;
    }
}
