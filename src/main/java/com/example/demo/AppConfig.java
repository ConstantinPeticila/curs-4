package com.example.demo;

import com.example.demo.service.HelloService;

//@Configuration
public class AppConfig {

//    @Bean
    public HelloService getHelloService(){
        return new HelloService();
    }
}
