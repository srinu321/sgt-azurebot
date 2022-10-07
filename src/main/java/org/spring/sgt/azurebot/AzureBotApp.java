package org.spring.sgt.azurebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@EnableCaching  
@ComponentScan(basePackages = "org.spring.sgt.azurebot")
public class AzureBotApp {
    public static void main(String[] args) {
        SpringApplication.run(AzureBotApp.class, args);
    }
}





