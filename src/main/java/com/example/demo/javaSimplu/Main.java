package com.example.demo.javaSimplu;

public class Main {

    public static void main(String[] args) {
        JavaService javaService = new JavaService();
        javaController javaController = new javaController(javaService);
        String ana = javaController.getNume("ana");
        System.out.println(ana);

    }
}
