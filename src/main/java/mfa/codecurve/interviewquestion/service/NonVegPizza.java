package mfa.codecurve.interviewquestion.service;

import org.springframework.stereotype.Component;


public class NonVegPizza implements Pizza {
    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
}
