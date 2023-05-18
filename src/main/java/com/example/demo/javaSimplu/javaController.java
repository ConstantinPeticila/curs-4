package com.example.demo.javaSimplu;

import org.springframework.web.bind.annotation.PathVariable;

public class javaController {

    private JavaService javaService;

    public javaController(JavaService javaService) {
        this.javaService = javaService;
    }

    public String getNume(String nume){
        return javaService.getMessage(nume);
    }
}
