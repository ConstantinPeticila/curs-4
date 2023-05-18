package com.example.demo.service;
import org.springframework.stereotype.Service;

@Service
public class ByebyeService implements MyService{


    @Override
    public String getMessage(String mesaj) {
        return "Adios, " + mesaj;
    }
}
