package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
//@Configuration
//@RestController
@EnableEurekaServer
public class App {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World server!";
//    }
//
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
