package mfa.codecurve.interviewquestion.propertSources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:email.properties")
@PropertySources({
    @PropertySource("classpath:email.properties")
})
public class PropertyConfig {

}
