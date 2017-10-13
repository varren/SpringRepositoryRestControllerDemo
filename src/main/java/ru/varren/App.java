package ru.varren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class App {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
    }
}
