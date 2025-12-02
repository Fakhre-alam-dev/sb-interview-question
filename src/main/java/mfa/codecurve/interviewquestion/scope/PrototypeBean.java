package mfa.codecurve.interviewquestion.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Prototype Bean Instance Created: " + this);
    }
}
