package com.example.worksopdip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorksopDipApplication {

    public static void main(String[] args) {
        // Beans
        ConfigurableApplicationContext context = SpringApplication.run(WorksopDipApplication.class, args);
        System.out.println("Beans count=" + context.getBeanDefinitionCount());

        GenerateIdService generateIdService = context.getBean(GenerateIdService.class);
        String id = generateIdService.get();
        System.out.println("Id: " + id);
    }

}
