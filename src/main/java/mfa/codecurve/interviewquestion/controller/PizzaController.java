package mfa.codecurve.interviewquestion.controller;

import mfa.codecurve.interviewquestion.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


public class PizzaController {

    private Pizza pizza;


    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

    private void init() {
        System.out.println("Initialization logic");
    }

    private void destroy() {
        System.out.println("Destruction logic");
    }
}
