package mfa.codecurve.interviewquestion;

import mfa.codecurve.interviewquestion.configurationpropeties.AppProperties;
import mfa.codecurve.interviewquestion.configurationpropeties.AppPropertiesDemo;
import mfa.codecurve.interviewquestion.controller.PizzaController;
import mfa.codecurve.interviewquestion.lazy.LazyLoader;
import mfa.codecurve.interviewquestion.propertSources.PropertySources;
import mfa.codecurve.interviewquestion.scope.PrototypeBean;
import mfa.codecurve.interviewquestion.scope.SingletonBean;
import mfa.codecurve.interviewquestion.values.ValuedAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.PropertySource;

@SpringBootApplication
public class SbInterviewQuestionApplication {

    public static void main(String[] args) {

        var context=SpringApplication.run(SbInterviewQuestionApplication.class, args);
//        PizzaController pizzaController= (PizzaController) context.getBean(PizzaController.class);
//        System.out.println("---------------@Component and @Qualifier--------------------");
//        System.out.println(pizzaController.getPizza());
//        System.out.println("---------------Scope--------------------");
//
//        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());
//        System.out.println("-------------------@Value--------------------");
//        ValuedAnnotation valuedAnnotation=context.getBean(ValuedAnnotation.class);
//        System.out.println(valuedAnnotation.getUrl());
//        System.out.println(valuedAnnotation.getAppName());
//        System.out.println(valuedAnnotation.getEmail());
//        System.out.println(valuedAnnotation.getPassword());
//        System.out.println(valuedAnnotation.getHomeDirectory());
//        System.out.println(valuedAnnotation.getPhone());
//        System.out.println(valuedAnnotation.getAddress());
//        System.out.println("---------------@Lazy----------------------------------------");
//       LazyLoader lazyLoader= context.getBean(LazyLoader.class);
//        System.out.println("---------------@PropertySource----------------------------------------");
//       PropertySources propertySources= context.getBean(PropertySources.class);
//        System.out.println(propertySources.getUsername());
//        System.out.println(propertySources.getPassword());
//        System.out.println(propertySources.getHost());

        System.out.println("---------------@ConfigurationProperties----------------------------------------");
        AppPropertiesDemo appPropertiesDemo = context.getBean(AppPropertiesDemo.class);
        appPropertiesDemo.displayInfo();

    }

}
