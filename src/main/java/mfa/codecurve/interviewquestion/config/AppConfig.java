package mfa.codecurve.interviewquestion.config;

import mfa.codecurve.interviewquestion.controller.PizzaController;
import mfa.codecurve.interviewquestion.service.NonVegPizza;
import mfa.codecurve.interviewquestion.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public VegPizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public NonVegPizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(vegPizza());
    }
}
