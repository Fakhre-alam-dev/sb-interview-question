package mfa.codecurve.interviewquestion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail() {
        // Simulate sending an email
        for(String email : dataSource.getEmails()) {
            System.out.println("Sending email to: " + email);
        }

    }
}
