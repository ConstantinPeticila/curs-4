package com.example.demo.rest;

import com.example.demo.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@Slf4j
public class Controller {

//    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Controller.class);
    private final MyService service;

    public Controller( @Qualifier("hello") MyService service) {
        this.service = service;
    }

    @GetMapping("/{nume}")
    public String getNume(@PathVariable String nume) throws InterruptedException {
//        System.out.println("s-a intrat in metoda din controller");
//        log.info("a intrat aici cu param {}",nume);
        return service.getMessage(nume);
    }



}
