package mfa.codecurve.interviewquestion.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSourceImpl implements DataSource{
    String[] emails ={
            "xyz@gmail.com", "aliza@gmail.com"
    };
    @Override
    public String[] getEmails() {
        return emails;
    }
}
