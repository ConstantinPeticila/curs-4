package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("hello")
@Slf4j
public class HelloService implements MyService {

    public String getMessage(String mesaj) throws InterruptedException {
//        log.info("a intrat aici cu param {}", mesaj);
        Thread.sleep(1000);
        return "Hello, " + mesaj;
    }
}
